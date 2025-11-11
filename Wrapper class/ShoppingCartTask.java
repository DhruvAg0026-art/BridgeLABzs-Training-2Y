package com.example.wrapper;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTask {
    private List<Double> prices;

    public ShoppingCartTask() {
        prices = new ArrayList<>();
    }

    public void addPrice(String priceStr) {
        try {
            double price = Double.parseDouble(priceStr);
            prices.add(price);
        } catch (NumberFormatException e) {
            System.out.println("Invalid price: " + priceStr);
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void displayPrices() {
        System.out.println("Prices in the shopping cart:");
        for (double price : prices) {
            System.out.printf("$%.2f%n", price);
        }
    }

    public static void main(String[] args) {
        ShoppingCartTask cart = new ShoppingCartTask();
        cart.addPrice("19.99");
        cart.addPrice("5.49");
        cart.addPrice("invalid"); // This will trigger an error message
        cart.addPrice("3.50");

        cart.displayPrices();
        System.out.printf("Total: $%.2f%n", cart.calculateTotal());
    }
}