package model.implementation;

import model.contract.IShape;

public class Rectangle extends Shape2D implements IShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double surface() {
        return length * width;
    }

    @Override
    public double perimetre() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("Shape type: ").append(this.getClass().getName())
                .append(NL)
                .append(TAB).append("Length: ").append(length)
                .append(NL)
                .append(TAB).append("Width: ").append(width)
                .append(NL)
                .append(TAB).append("Surface: ").append(surface())
                .append(NL)
                .append(TAB).append("Perimeter: ").append(perimetre());
        return sb.toString();
    }
}
