package edu.pafiast.codesmells.changepreventors.shortgun.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailService {
    public void sendInvoice(Customer customer, double total) {
        log.info("Sending invoice to: " + customer.getEmail());
        log.info("Total: " + total);
    }
}