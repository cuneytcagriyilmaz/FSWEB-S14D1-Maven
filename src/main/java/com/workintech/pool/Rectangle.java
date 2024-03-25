package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = Math.max(0, width);
        this.length = Math.max(0, length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(0, width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = Math.max(0, length);
    }

    public double getArea() {
        return getWidth() * getLength();
    }
}
