package edu.pafiast.codesmells.changepreventors.parallelinheritancehierarchies.bad;

public class CarDriver extends Driver {
    @Override
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            System.out.println("Driving a car");
        }
    }
}