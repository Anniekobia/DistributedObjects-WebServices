package com.javaspring.demo;

public class TestingOop {
    public static void main(String arg[]){
        Rectangle rectangle=new Rectangle(1,3,ShapeType.TWO_D);
        System.out.println(rectangle.toString()+"\n");
        Circle circle=new Circle(7,ShapeType.TWO_D);
        System.out.println(circle.toString()+"\n");
        Triangle triangle=new Triangle(12,3,ShapeType.TWO_D);
        System.out.println(triangle.toString()+"\n");
    }
}

