package edu.pafiast.codesmells.changepreventors.divergentchange.good;

import edu.pafiast.codesmells.changepreventors.utils.Order;

public class OrderProcessor {
    private OrderValidator validator;
    private TaxCalculator taxCalculator;
    private OrderRepository repository;
    private EmailService emailService;

    public OrderProcessor(OrderValidator validator, TaxCalculator taxCalculator,
                          OrderRepository repository, EmailService emailService) {
        this.validator = validator;
        this.taxCalculator = taxCalculator;
        this.repository = repository;
        this.emailService = emailService;
    }

    public void processOrder(Order order) {
        validator.validate(order);
        taxCalculator.calculate(order);
        repository.save(order);
        emailService.sendConfirmation(order);
    }
}