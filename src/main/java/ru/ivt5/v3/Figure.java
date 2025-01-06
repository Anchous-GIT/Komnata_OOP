package ru.ivt5.v3;

public abstract class Figure {

    // абстрактные методы для фигур
    public abstract double getArea();
    public abstract double getPerimeter();

    // Метод, который можно реализовать для всех фигур
    public boolean isInside(int x, int y){
        return false;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }
}
