package edu.pafiast.codesmells.changepreventors.shortgun.good;

public class EmailService {
    public void sendInvoice(Customer customer, double total) {
        customer.sendInvoice(total);
    }
}