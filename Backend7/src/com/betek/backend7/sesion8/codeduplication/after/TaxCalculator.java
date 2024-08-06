package com.betek.backend7.sesion8.codeduplication.after;

import java.util.Arrays;
import java.util.List;

public class TaxCalculator {

    public double calculateTotalPrice(List<OrderItem> orderItems) {
        double totalPrice = 0;
        for (OrderItem item : orderItems) {
            double tax = 0;
            switch (item.getCustomerType()) {
                case "regular" -> {
                    tax = calculateTax(item.getCustomerAge(), item.getAmount(), 0.05, 0.10);
                }
                case "premium" -> {
                    tax = calculateTax(item.getCustomerAge(), item.getAmount(), 0.03, 0.07);
                }
                case "vip" -> {
                    tax = calculateTax(item.getCustomerAge(), item.getAmount(), 0.02, 0.05);
                }
            }

            double itemTotal = (item.getAmount() + tax) * item.getQuantity();
            totalPrice += itemTotal;
        }
        return totalPrice;
    }

    private double calculateTax(int customerAge, double itemValue, double rate1, double rate2) {
        if (customerAge > 65) {
            return itemValue * rate1;
        } else {
            return itemValue * rate2;
        }
    }

    public static void main(String[] args) {
        List<OrderItem> orderItems = Arrays.asList(
                new OrderItem(100, "regular", 70, "Alice", "alice@example.com", "123 Main St", 2),
                new OrderItem(200, "premium", 40, "Bob", "bob@example.com", "456 Oak St", 1),
                new OrderItem(150, "vip", 68, "Charlie", "charlie@example.com", "789 Pine St", 3)
        );

        TaxCalculator calculator = new TaxCalculator();
        System.out.println("Total Price: " + calculator.calculateTotalPrice(orderItems));
    }
}

