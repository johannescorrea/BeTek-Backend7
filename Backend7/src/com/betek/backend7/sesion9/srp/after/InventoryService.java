package com.betek.backend7.sesion9.srp.after;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private List<InventoryDetail> inventory;

    public InventoryService() {
        inventory = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        InventoryDetail detail = findInventoryDetail(product);
        if (detail == null) {
            inventory.add(new InventoryDetail(product, quantity));
        } else {
            throw new IllegalArgumentException("Product already exists");
        }
    }

    public void updateInventory(Product product, int amount) {
        InventoryDetail detail =  findInventoryDetail(product);
        if (detail == null) {
            throw new IllegalArgumentException("Product does not exist");
        }
        if (amount > 0) {
            detail.setQuantity(detail.getQuantity() + amount);
        } else if (amount < 0 && detail.getQuantity() >= Math.abs(amount)) {
            detail.setQuantity(detail.getQuantity() + amount);
        } else {
            throw new IllegalArgumentException("Invalid inventory update amount");
        }
    }

    private InventoryDetail findInventoryDetail(Product product) {
        InventoryDetail detail = null;
        for (InventoryDetail inventoryDetail : inventory) {
            if (inventoryDetail.getProduct().getName().equals(product.getName())) {
                detail = inventoryDetail;
                break;
            }
        }
        return detail;
    }
}
