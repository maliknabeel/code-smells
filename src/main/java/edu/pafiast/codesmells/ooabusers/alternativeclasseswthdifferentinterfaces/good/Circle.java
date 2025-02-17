package edu.pafiast.codesmells.ooabusers.alternativeclasseswthdifferentinterfaces.good;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        log.info("Calculating area of circle");
        return Math.PI * radius * radius;
    }
}