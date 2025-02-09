package edu.pafiast.codesmells.changepreventors.parallelinheritancehierarchies.good;

public class Car implements Drivable{
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}