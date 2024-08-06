package com.betek.backend7.sesion9.liskov.case2.after;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        printArea(rect);

        Square square = new Square(5);
        printArea(square);
    }

    public static void printArea(Figura shape) {
        System.out.println("Expected area: " + shape.getArea());
    }
}
