package ru.ivt5.v1;

public class Point {//класс point
    private int x;
    private int y;//поля класса (аналог private в с++


    public Point(){//конструктор без параметров
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){//конструктор с параметрами
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return this.x;
    }//для чтения х

    public void setX(int x){
        this.x = x;
    }//для записи в х

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void moveTo(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public void moveRel(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

}


