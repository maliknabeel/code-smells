package edu.pafiast.codesmells.couplers.featureenvy.good;

public class Customer {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getInvoice(double total) {
        return "Customer: " + name + "\n Email: " + email + "\n Total: " + total;
    }
}