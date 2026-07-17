package com.UserService.UserService.controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import com.UserService.UserService.dto.Expensedto;
import com.UserService.UserService.entity.ExpenseEntity;
import com.UserService.UserService.service.ExpenseService;
import com.UserService.UserService.service.OCRService;
import com.UserService.UserService.service.ReceiptAIService;

@RestController
@RequestMapping("/api/receipt")
public class ReceiptController {

    private static final Set<String> ALLOWED_EXTENSIONS =
            Set.of(".jpg", ".jpeg", ".png", ".pdf");

    private final ExpenseService expenseService;
    private final ReceiptAIService receiptAIService;
    private final OCRService ocrService;

    public ReceiptController(
            ExpenseService expenseService,
            ReceiptAIService receiptAIService,
            OCRService ocrService) {

        this.expenseService = expenseService;
        this.receiptAIService = receiptAIService;
        this.ocrService = ocrService;
    }

    @PostMapping("/scan")
    public String scanReceipt(
            @RequestParam("image") MultipartFile image) {

        File file = null;

        try {

            file = createTempFile(image);

            return ocrService.extractText(file);

        } catch (Exception e) {

            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Failed to scan receipt",
                    e
            );

        } finally {

            if (file != null && file.exists()) {
                file.delete();
            }
        }
    }

    @PostMapping("/create-expense")
    public ExpenseEntity createExpenseFromReceipt(

            @RequestParam("image") MultipartFile image,

            @RequestHeader("Authorization") String authHeader) {

        File file = null;

        try {

            file = createTempFile(image);

            String text = ocrService.extractText(file);

            Double amount =
                    receiptAIService.extractAmount(text);

            String description =
                    receiptAIService.extractDescription(text);

            Expensedto request = new Expensedto();

            request.setAmount(amount);
            request.setDescription(description);
            request.setExpenseDate(LocalDate.now());

            String token = authHeader.substring(7);

            return expenseService.addExpenseFromReceipt(
                    request,
                    token
            );

        } catch (Exception e) {

            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Receipt processing failed",
                    e
            );

        } finally {

            if (file != null && file.exists()) {
                file.delete();
            }
        }
    }

    private File createTempFile(MultipartFile image) throws IOException {

        if (image == null || image.isEmpty()) {
            throw new IllegalArgumentException("File is empty");
        }

        String originalName = image.getOriginalFilename();

        String extension = ".jpg";

        if (originalName != null && originalName.contains(".")) {

            extension =
                    originalName.substring(
                            originalName.lastIndexOf(".")
                    ).toLowerCase();

        }

        if (!ALLOWED_EXTENSIONS.contains(extension)) {

            throw new IllegalArgumentException(
                    "Only JPG, JPEG, PNG and PDF files are allowed."
            );

        }

        File file =
                File.createTempFile(
                        "receipt-",
                        extension
                );

        image.transferTo(file);

        return file;
    }
}