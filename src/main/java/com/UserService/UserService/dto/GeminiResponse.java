package com.UserService.UserService.dto;

public class GeminiResponse {

    private Double amount;
    private String description;
    private String category;

    public GeminiResponse() {
    }

    public GeminiResponse(Double amount, String description, String category) {
        this.amount = amount;
        this.description = description;
        this.category = category;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}