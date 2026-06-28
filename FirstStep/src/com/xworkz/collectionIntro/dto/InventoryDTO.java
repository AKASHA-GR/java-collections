package com.xworkz.collectionIntro.dto;

import java.io.Serializable;

public class InventoryDTO implements Serializable {
    private int itemId;
    private String productName;
    private int quantity;
    private String location;
    private String supplier;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public InventoryDTO(int itemId, String supplier, String location, int quantity, String productName) {
        this.itemId = itemId;
        this.supplier = supplier;
        this.location = location;
        this.quantity = quantity;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "InventoryDTO{" +
                "itemId=" + itemId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", location='" + location + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}
