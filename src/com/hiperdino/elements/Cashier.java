package com.hiperdino.elements;

import java.util.LinkedList;
import java.util.Queue;

import com.hiperdino.elements.Customer;
import com.hiperdino.util.Format;

public class Cashier {
    
    private int id;
    private Queue<Customer> customers;

    public Cashier(int id) {

        this.id = id;
        this.customers = new LinkedList<>();
    }

    private String getCostumers() {

        StringBuilder list = new StringBuilder();

        for (Customer customer : this.customers) {
            list.append("\n\t").append("- ").append(customer);
        }

        return list.toString();
    }

    public void addCustomer(Customer customer) {

        customers.add(customer);
    }

    public Customer nexCustomer() {

        return this.customers.poll();
    }

    private int customersLeft() {

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
