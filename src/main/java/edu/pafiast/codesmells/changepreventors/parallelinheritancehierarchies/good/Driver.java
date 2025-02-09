package edu.pafiast.codesmells.changepreventors.parallelinheritancehierarchies.good;

public class Driver {
    private Drivable vehicle;

    public Driver(Drivable vehicle) {
        this.vehicle = vehicle;
    }

    public void drive() {
        vehicle.drive();
    }
}