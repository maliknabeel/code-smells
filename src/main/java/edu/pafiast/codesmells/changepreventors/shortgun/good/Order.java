package edu.pafiast.codesmells.changepreventors.shortgun.good;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Order {
    private Customer customer;
    private double total;

    public void printInvoice() {
        customer.printInfo();
        log.info("Total: " + total);
    }
}