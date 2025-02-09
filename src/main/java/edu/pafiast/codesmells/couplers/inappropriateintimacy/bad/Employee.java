package edu.pafiast.codesmells.couplers.inappropriateintimacy.bad;

public class Employee {
    public String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
}