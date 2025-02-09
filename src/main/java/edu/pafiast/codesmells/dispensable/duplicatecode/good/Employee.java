package edu.pafiast.codesmells.dispensable.duplicatecode.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printDetails() {
        printCommonDetails();
    }

    public void printDetailsWithBonus(double bonus) {
        printCommonDetails();
        log.info("Bonus: " + bonus);
    }

    private void printCommonDetails() {
        log.info("Name: " + name);
        log.info("Salary: " + salary);
    }
}