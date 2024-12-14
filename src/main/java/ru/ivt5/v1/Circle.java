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
    public void moveTo(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    // 10.
    public void moveTo(Point point){
        this.center = point;
    }

    // 11.
    public void moveRel(int dx, int dy){
        this.center.setX(this.center.getX()+dx);
        this.center.setY(this.center.getY()+dy);
    }

    // 12. Увеличивает радиус Circle в n раз
    public void resize(double ratio){
        this.radius = (int)(this.radius * ratio);
    }

    // 13. Возвращает площадь круга.
    public double getArea(){
        return  Math.PI * radius * radius;
    }

    // 14. Возвращает длину окружности
    public double getPerimeter(){
        return Math.PI * radius * 2;
    }

    // 15. лежит ли точка (x, y) внутри Circle.
    public boolean isInside(int x, int y) {
        // Расстояние между точкой (x, y) и центром круга
        int dx = x - this.center.getX();  // Разница по оси X
        int dy = y - this.center.getY();  // Разница по оси Y

        // Если сумма квадратов этих разностей меньше или равна квадрату радиуса,
        // то точка лежит внутри круга (или на его окружности)
        return dx * dx + dy * dy <= radius * radius;
    }

    // 16.
    public boolean isInside(Point point) {
        int dx = point.getX() - this.center.getX();
        int dy = point.getY() - this.center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }



}
