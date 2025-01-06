package ru.ivt5.v2;

public interface Movable {
    void moveTo(int x, int y);

    void moveTo(Point point);

    void moveRel(int dx, int dy);


}
