package com.UserService.UserService.service;

import java.io.File;

import org.springframework.stereotype.Service;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

@Service
public class OCRService {

    public String extractText(File file) {

        ITesseract tesseract = new Tesseract();

        // Windows me local development ke liye
        // Render/Linux ke liye baad me alag setup chahiye
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            tesseract.setDatapath("C:/Program Files/Tesseract-OCR/tessdata");
        }

        tesseract.setLanguage("eng");
        tesseract.setPageSegMode(6);
        tesseract.setOcrEngineMode(1);

        try {
            return tesseract.doOCR(file);
        } catch (Exception e) {
            throw new RuntimeException("OCR failed", e);
        }
    }
}
