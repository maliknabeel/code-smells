package edu.pafiast.codesmells.couplers.inappropriateintimacy.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Department {
    private String name;
    private Employee manager;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public void printManagerDetails() {
        // Use public methods to access data
        log.info("Manager: " + manager.getName());
    }
}