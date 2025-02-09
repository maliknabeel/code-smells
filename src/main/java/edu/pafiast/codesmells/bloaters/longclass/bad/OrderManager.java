package edu.pafiast.codesmells.bloaters.longclass.bad;

import edu.pafiast.codesmells.bloaters.utils.Order;

public class OrderManager {
    public void processOrder(Order order) { /* Processing logic */ }
    public void applyDiscount(Order order) { /* Discount logic */ }
    public void sendInvoice(Order order) { /* Invoice generation */ }
    public void notifyCustomer(Order order) { /* Email sending */ }
}