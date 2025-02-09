package edu.pafiast.codesmells.changepreventors.parallelinheritancehierarchies.bad;

public class Truck extends Vehicle {
    @Override
    public void start() {
        System.out.println("Truck started");
    }
}