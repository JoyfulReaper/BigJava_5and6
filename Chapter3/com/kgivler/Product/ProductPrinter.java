package com.kgivler.Product;

public class ProductPrinter {
  public static void main(String[] args)
  {
      Product p1 = new Product("Toaster", 29.95);
      Product p2 = new Product("Juice", 6.00);

      System.out.println("Product: " + p1.getName() + " Price: " + String.format("%.2f", p1.getPrice()));
      System.out.println("Product: " + p2.getName() + " Price: " + String.format("%.2f", p2.getPrice()));

      p1.reducePrice(5.00);
      p2.reducePrice(5.00);

      System.out.println("Product: " + p1.getName() + " Price: " + String.format("%.2f", p1.getPrice()));
      System.out.println("Product: " + p2.getName() + " Price: " + String.format("%.2f", p2.getPrice()));

  }  
}