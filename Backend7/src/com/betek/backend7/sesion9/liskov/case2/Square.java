package com.betek.backend7.sesion9.liskov.case2;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Ensures width and height are always the same
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); // Ensures width and height are always the same
    }
}
