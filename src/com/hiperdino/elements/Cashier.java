package com.hiperdino.elements;

import java.util.LinkedList;
import java.util.Queue;

import com.hiperdino.util.Format;

public class Cashier {
    
    private static int COUNT = 0;

    private int id;
    private Queue<Customer> customers;
    private boolean isOpen;

    public Cashier() {

        this.id = ++COUNT;
        this.customers = new LinkedList<>();
        this.isOpen = false;
    }

    private String getCostumers() {

        StringBuilder list = new StringBuilder();

        for (Customer customer : this.customers) {
            list.append("\n\t").append("- ").append(customer);
        }

        return list.toString();
    }

    public boolean isOpen() {

        return this.isOpen;
    }

    public boolean open() {

        if (this.isOpen) {
            return false;
        }
        
        this.isOpen = true;
        
        return true;
    }

    public boolean close() {

        if (!isOpen) {
            return false;
        }
        
        this.isOpen = false;
        
        return true;
    }

    public void addCustomer(Customer customer) {

        customers.add(customer);
    }

    public Customer nextCustomer() {

        return this.customers.poll();
    }

    public int customersLeft() {

        return this.customers.size();
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(Format.header("Caja " + this.id, '_'))
                     .append("\nClientes pendientes: " + this.customersLeft())
                     .append(this.getCostumers());

        return stringBuilder.toString();
    }
}