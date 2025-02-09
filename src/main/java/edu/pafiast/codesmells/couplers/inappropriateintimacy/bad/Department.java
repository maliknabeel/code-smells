package edu.pafiast.codesmells.couplers.inappropriateintimacy.bad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private String name;
    private Employee manager;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public void printManagerDetails() {
        // Inappropriate Intimacy: Accessing Employee's private field directly
        System.out.println("Manager: " + manager.name);
    }
}