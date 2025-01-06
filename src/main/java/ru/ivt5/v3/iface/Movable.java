package ru.ivt5.v3.iface;

import ru.ivt5.v3.Point;

public interface Movable {
    void moveTo(int x, int y);

    default void moveTo(Point point) {
        if (point != null) {
            moveTo(point.getX(), point.getY());
        }
    }

    void moveRel(int dx, int dy);


}
