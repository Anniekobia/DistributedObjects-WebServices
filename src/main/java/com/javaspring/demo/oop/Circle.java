package com.javaspring.demo.oop;

public class Circle extends Shape implements PerimeterInterface {
    private double radius;

    public Circle(double radius,ShapeType shapeType) {
        super(shapeType);
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        area=Math.PI*radius*radius;
    }


    public void calculatePerimeter() {
        perimeter=Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", shapeType=" + shapeType +
                '}';
    }
}
