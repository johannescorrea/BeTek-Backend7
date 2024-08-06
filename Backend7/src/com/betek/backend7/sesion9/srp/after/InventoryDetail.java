package com.betek.backend7.sesion9.srp.after;

public class InventoryDetail {

    private Product product;
    private int quantity;

    public InventoryDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return quantity > 0;
    }
}
