package edu.pafiast.codesmells.couplers.featureenvy.good;

public class Order {
    private Customer customer;
    private double total;

    public String getInvoice() {
        return customer.getInvoice(total);
    }
}