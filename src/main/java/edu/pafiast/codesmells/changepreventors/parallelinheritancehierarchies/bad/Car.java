package edu.pafiast.codesmells.changepreventors.parallelinheritancehierarchies.bad;

public class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Car started");
    }
}