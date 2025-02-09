package edu.pafiast.codesmells.bloaters.longmethods.good;

import edu.pafiast.codesmells.bloaters.utils.EmailService;
import edu.pafiast.codesmells.bloaters.utils.Order;
import edu.pafiast.codesmells.bloaters.utils.PaymentService;

public class OrderedProcessorImproved {
    private final PaymentService paymentService = new PaymentService();
    private final EmailService emailService = new EmailService();

    public void processOrder(Order order) {
        validateOrder(order);
        double total = calculateTotal(order);
        paymentService.charge(order.getCustomer(), total);
        emailService.sendOrderConfirmation(order.getCustomer().getEmail(), order);
        System.out.println("Order processed successfully.");
    }

    private void validateOrder(Order order) {
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one item.");
        }
    }

    private double calculateTotal(Order order) {
        double total = order.getItems().stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
        return (total > 100) ? total * 0.9 : total; // 10% discount for orders above $100
    }
}