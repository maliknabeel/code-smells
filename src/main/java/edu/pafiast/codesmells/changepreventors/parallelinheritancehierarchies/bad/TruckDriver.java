package edu.pafiast.codesmells.changepreventors.parallelinheritancehierarchies.bad;

public class TruckDriver extends Driver {
    @Override
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Truck) {
            System.out.println("Driving a truck");
        }
    }
}