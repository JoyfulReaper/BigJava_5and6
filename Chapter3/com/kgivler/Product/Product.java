package com.kgivler.Product;

public class Product {
    private double price;
    private String name;

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void reducePrice(double amount) {
        if(price - amount < 0)
            price = 0;
        else
            price -= amount;
    }
}