package edu.pafiast.codesmells.couplers.inappropriateintimacy.good;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
}
