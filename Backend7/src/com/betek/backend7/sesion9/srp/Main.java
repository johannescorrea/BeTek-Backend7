package com.betek.backend7.sesion9.srp;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creating a product
        Product product = new Product("Laptop", 1500, 10);

        // Display product details
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Quantity: " + product.getQuantity());

        // Checking if the product is in stock
        System.out.println("Is in stock: " + product.isInStock());

        // Calculating a discount on the product
        double discountPercentage = 10.0;
        double discountedPrice = product.calculateDiscount(discountPercentage);
        System.out.println("Discounted Price (10%): " + discountedPrice);

        // Updating inventory
        product.updateInventory(-2);
        System.out.println("Updated Quantity: " + product.getQuantity());
        System.out.println("Is in stock: " + product.isInStock());

        // Trying to update inventory with invalid amount
        try {
            product.updateInventory(-20); // Invalid update
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
