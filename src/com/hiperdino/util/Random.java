package com.hiperdino.util;

import java.security.SecureRandom;

import com.hiperdino.elements.Customer;
import com.hiperdino.elements.Product;

public class Random {
    
    private static String[] availableNames = {
        "Juan", "María", "José", "Ana", "Pedro", "Isabel", "Antonio", "Lucía",
        "Francisco", "Rosa", "Miguel", "Carmen", "Diego", "Laura", "Javier", "Sofía",
        "Manuel", "Elena", "David", "Teresa"
    };

    private static String[] availableProducts = {
        "Leche", "Pan", "Arroz", "Huevos", "Queso", "Manzanas", "Plátanos",
        "Pasta", "Salsa de tomate", "Cereal", "Papel higiénico", "Jabón"
    };

    public static Customer nexCustomer() {

        SecureRandom random = new SecureRandom();
        int index = random.nextInt(availableNames.length);
        Customer customer = new Customer(availableNames[index]);

        return customer;
    }

    public static Product nextProduct() {

        SecureRandom random = new SecureRandom();
        int index = random.nextInt(availableProducts.length);
        Product product = new Product(availableProducts[index]);

        return product;
    }
}