package edu.pafiast.codesmells.couplers.featureenvy.bad;

public class Order {
    private Customer customer;
    private double total;

    public String getInvoice() {
        return "Customer: " + customer.getName() + "\nEmail: " + customer.getEmail() + "\nTotal: " + total;
    }
}