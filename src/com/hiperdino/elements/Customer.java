package com.hiperdino.elements;

import java.util.Stack;

import com.hiperdino.util.Format;

public class Customer {
    
    private String name;
    private Stack<Product> products;

    public Customer(String name) {

        this.name = name;
        this.products = new Stack<>();
    }

    public String getName() {

        return this.name;
    }

    private String getProducts() {

        StringBuilder list = new StringBuilder();

        for (Product product : this.products) {
            list.append("\n").append(" - ").append(product);
        }

        return list.toString();
    }

    public void addProduct(Product product) {

        this.products.push(product);
    }

    public Product removeProduct() {

        return this.products.pop();
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(Format.header(this.name, '_'))
                     .append("\nCesta de la compra:")
                     .append(this.getProducts())
                     .append("\n");

        return stringBuilder.toString();
    }
}
