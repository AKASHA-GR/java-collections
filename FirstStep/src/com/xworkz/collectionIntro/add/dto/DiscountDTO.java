package com.xworkz.collectionIntro.add.dto;

import java.io.Serializable;

public class DiscountDTO implements Serializable {
    private int discountId;
    private String code;
    private String description;
    private String percentage;
    private String expiryDate;

    public DiscountDTO(int discountId, String code, String description, String percentage,String expiryDate) {
        this.discountId = discountId;
        this.code = code;
        this.description = description;
        this.percentage = percentage;
        this.expiryDate = expiryDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "DiscountDTO{" +
                "discountId=" + discountId +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", percentage='" + percentage + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
