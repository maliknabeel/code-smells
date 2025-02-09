package edu.pafiast.codesmells.bloaters.longparameterlist.bad;

import edu.pafiast.codesmells.bloaters.utils.Item;

import java.util.List;

public class OrderService {
    public void createOrder(String customerName, String customerEmail, String shippingAddress,
                            List<Item> items, double discount, String paymentMethod, String notes) {
        // Order creation logic
    }
}