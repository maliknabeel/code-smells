package edu.pafiast.codesmells.dispensable.duplicatecode.bad;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printDetails() {
        log.info("Name: " + name);
        log.info("Salary: " + salary);
    }

    public void printDetailsWithBonus(double bonus) {
        log.info("Name: " + name);
        log.info("Salary: " + salary);
        log.info("Bonus: " + bonus);
    }
}