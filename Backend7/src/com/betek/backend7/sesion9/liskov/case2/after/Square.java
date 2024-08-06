package com.betek.backend7.sesion9.liskov.case2.after;

public class Square extends Figura {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
