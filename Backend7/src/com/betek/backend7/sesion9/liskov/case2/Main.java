package com.betek.backend7.sesion9.liskov.case2;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        printArea(rect);

        Rectangle square = new Square(5);
        printArea(square);
    }

    public static void printArea(Rectangle rect) {
        rect.setWidth(10);
        rect.setHeight(5);
        System.out.println("Expected area: 50, Actual area: " + rect.getArea());
    }
}
