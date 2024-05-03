package com.hiperdino.management;

import com.hiperdino.elements.Cashier;
import com.hiperdino.elements.Customer;
import com.hiperdino.util.Random;

public class Manager {
    
    private final Cashier cashier;

    public Manager() {

        this.cashier = new Cashier();
    }

    public void openCashier() {

        this.cashier.open();
    }

    public void addCustomer() {

        Customer customer = Random.nexCustomer();
        int numProducts = (int) (Math.random() * 10) + 1;

        for (int i = 0; i < numProducts; i++) {
            customer.addProduct(Random.nextProduct());
        }

        cashier.addCustomer(customer);
        System.out.println("Nuevo cliente añadido a la cola:");
        System.out.println(customer);
    }

    public void serveCustomer() {

        Customer nextCustomer = cashier.nextCustomer();
        System.out.println("Cliente atendido:");
        System.out.println(nextCustomer);
    }

    public void checkQueue() {

        System.out.println("Clientes pendientes:");
        System.out.println(cashier);
    }

    public void closeCashier() {

        this.cashier.close();
        System.out.println("Caja cerrada. Gracias por su visita.");
    }
}