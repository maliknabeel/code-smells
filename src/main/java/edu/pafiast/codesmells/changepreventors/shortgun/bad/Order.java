package edu.pafiast.codesmells.changepreventors.shortgun.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Order {
    private Customer customer;
    private double total;

    public void printInvoice() {
        log.info("Customer: " + customer.getName());
        log.info("Email: " + customer.getEmail());
        log.info("Total: " + total);
    }
}