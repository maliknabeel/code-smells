package edu.pafiast.codesmells.bloaters.longmethods.bad;

import edu.pafiast.codesmells.bloaters.utils.EmailService;
import edu.pafiast.codesmells.bloaters.utils.Item;
import edu.pafiast.codesmells.bloaters.utils.Order;
import edu.pafiast.codesmells.bloaters.utils.PaymentService;

public class OrderProcessor {
    public void processOrder(Order order) {
        System.out.println("Processing order: " + order.getId());

        // Validate order
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one item.");
        }

        // Calculate total price
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }

        // Apply discount
        if (total > 100) {
            total *= 0.9; // 10% discount
        }

        // Payment processing
        PaymentService paymentService = new PaymentService();
        paymentService.charge(order.getCustomer(), total);

        // Send confirmation
        EmailService emailService = new EmailService();
        emailService.sendOrderConfirmation(order.getCustomer().getEmail(), order);

        System.out.println("Order processed successfully.");
    }
}