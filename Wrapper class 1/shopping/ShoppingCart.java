package com.example.wrappers.shopping;

import com.example.wrappers.models.CartItem;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (CartItem item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Shopping cart is empty.");
            return;
        }
        System.out.println("Items in your shopping cart:");
        for (CartItem item : items) {
            System.out.println(item.getQuantity() + " x " + item.getName() + " at $" + item.getPrice() + " each");
        }
        System.out.printf("Total: $%.2f%n", calculateTotal());
    }

    public void convertAndAddItem(String name, String priceStr, int quantity) {
        try {
            double price = Double.parseDouble(priceStr);
            addItem(new CartItem(name, price, quantity));
        } catch (NumberFormatException e) {
            System.out.println("Invalid price input: " + priceStr);
        }
    }
}