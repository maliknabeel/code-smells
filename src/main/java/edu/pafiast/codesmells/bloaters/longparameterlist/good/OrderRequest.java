package edu.pafiast.codesmells.bloaters.longparameterlist.good;

import edu.pafiast.codesmells.bloaters.utils.Item;

import java.util.List;

public class OrderRequest {
    private CustomerInfo customerInfo;
    private List<Item> items;
    private double discount;
    private String paymentMethod;
    private String notes;
}