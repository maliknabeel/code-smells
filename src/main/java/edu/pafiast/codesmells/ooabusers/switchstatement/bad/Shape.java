package edu.pafiast.codesmells.ooabusers.switchstatement.bad;

public class Shape {
    private String type;
    private double radius;
    private double width;
    private double height;
    private double base;

    public Shape(String type) {
        this.type = type;
    }

    public double calculateArea() {
        switch (type) {
            case "circle":
                return Math.PI * radius * radius;
            case "rectangle":
                return width * height;
            case "triangle":
                return 0.5 * base * height;
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}