package edu.pafiast.codesmells.changepreventors.parallelinheritancehierarchies.good;

public class Truck implements Drivable{
    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }
}