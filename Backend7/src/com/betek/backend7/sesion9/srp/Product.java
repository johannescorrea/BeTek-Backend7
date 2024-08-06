package com.betek.backend7.sesion9.srp;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateDiscount(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }

    public boolean isInStock() {
        return quantity > 0;
    }

    // Method to update inventory
    public void updateInventory(int amount) {
        if (amount > 0) {
            quantity += amount;
        } else if (amount < 0 && quantity >= Math.abs(amount)) {
            quantity += amount;
        } else {
            throw new IllegalArgumentException("Invalid inventory update amount");
        }
    }
}
