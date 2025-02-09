package edu.pafiast.codesmells.changepreventors.shortgun.good;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Customer {
    private String name;
    private String email;

    public void printInfo() {
        log.info("Customer: " + name);
        log.info("Email: " + email);
    }

    public void sendInvoice(double total) {
        log.info("Sending invoice to: " + email);
        log.info("Total: " + total);
    }
}