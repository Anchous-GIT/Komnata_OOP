package ru.ivt5.v1;

public class Circle {

    private Point center;
    private int radius;

    // 1. Circle по координатам центра и значению радиуса.
    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    // 2.
    public Circle(int xCenter, int yCenter, int radius){
        this.center = new Point(xCenter, yCenter);
        this.radius = radius;
    }

    // 3. Circle c значением радиуса
    public Circle(int radius){
        this.center = new Point();
        this.radius = radius;
    }

    // 4. Без параметров
    public Circle(){
        this.center = new Point();
        this.radius = 1;
    }

    // 5. Геттер
    public Point getCenter(){
        return this.center;
    }

    // 6.
    public int getRadius(){
        return this.radius;
    }

    // 7. Сеттер
    public void setCenter(Point center){
        this.center = center;
    }

    // 8.
    public void setRadius(int radius){
        this.radius = radius;
    }

    // 9.
}
