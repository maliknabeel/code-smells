package edu.pafiast.codesmells.changepreventors.divergentchange.bad;

import edu.pafiast.codesmells.changepreventors.utils.Order;

public class OrderProcessor {
    public void processOrder(Order order) {
        validateOrder(order);
        calculateTax(order);
        saveOrderToDatabase(order);
        sendConfirmationEmail(order);
    }

    private void validateOrder(Order order) {
        // Validation logic
    }

    private void calculateTax(Order order) {
        // Tax calculation logic
    }

    private void saveOrderToDatabase(Order order) {
        // Database saving logic
    }

    private void sendConfirmationEmail(Order order) {
        // Email sending logic
    }
}