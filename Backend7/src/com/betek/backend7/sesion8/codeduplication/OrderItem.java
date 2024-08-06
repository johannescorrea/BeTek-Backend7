package com.betek.backend7.sesion8.codeduplication;

class OrderItem {
    private double amount;
    private String customerType;
    private int customerAge;
    private String customerName;
    private String customerEmail;
    private String customerAddress;
    private int quantity;

    public OrderItem(double amount, String customerType, int customerAge, String customerName, String customerEmail, String customerAddress, int quantity) {
        this.amount = amount;
        this.customerType = customerType;
        this.customerAge = customerAge;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerType() {
        return customerType;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public int getQuantity() {
        return quantity;
    }
}
