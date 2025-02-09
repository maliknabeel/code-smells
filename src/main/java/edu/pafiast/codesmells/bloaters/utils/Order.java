package edu.pafiast.codesmells.bloaters.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Order {
    private int id;
    private List<Item> items;
    private Customer customer;
}
