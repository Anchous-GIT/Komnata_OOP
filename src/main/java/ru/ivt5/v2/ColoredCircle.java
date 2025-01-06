package ru.ivt5.v2;

import ru.ivt5.v2.iface.Colored;

public class ColoredCircle extends Circle  implements Colored {


    private int color;

    // 1. Конструктор с центром, радиусом и цветом
    public ColoredCircle(Point center, int radius, int color) {


        super(center, radius); // Вызов конструктора из Circle
        this.color = color;
    }

    // 2. Конструктор с координатами центра, радиусом и цветом
    public ColoredCircle(int xCenter, int yCenter, int radius, int color) {
        super(xCenter, yCenter, radius); // Вызов конструктора из Circle
        this.color = color;
    }

    // 3. Конструктор с радиусом и цветом
    public ColoredCircle(int radius, int color) {
        super(radius); // Центр по умолчанию (0, 0)
        this.color = color;
    }

    // 4. Конструктор с цветом
    public ColoredCircle(int color) {
        super(); // Центр (0, 0), радиус 1
        this.color = color;
    }

    // 5. Конструктор по умолчанию
    public ColoredCircle() {
        super(); // Центр (0, 0), радиус 1
        this.color = 1; // Цвет по умолчанию
    }

    // 6. Метод получения цвета
    public int getColor() {
        return this.color;
    }

    // 7. Метод установки цвета
    public void setColor(int color) {
        this.color = color;
    }

}
