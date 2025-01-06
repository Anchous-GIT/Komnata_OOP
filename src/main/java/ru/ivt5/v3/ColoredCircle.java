package ru.ivt5.v3;

import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.iface.Colored;

public class ColoredCircle extends Circle implements Colored {


    private Color color;

    // 1. Конструктор с центром, радиусом и цветом
    public ColoredCircle(Point center, int radius, Color color) {


        super(center, radius); // Вызов конструктора из Circle
        this.color = color;
    }

    // 2. Конструктор с координатами центра, радиусом и цветом
    public ColoredCircle(int xCenter, int yCenter, int radius, Color color) {
        super(xCenter, yCenter, radius); // Вызов конструктора из Circle
        this.color = color;
    }

    // 3. Конструктор с радиусом и цветом
    public ColoredCircle(int radius, Color color) {
        super(radius); // Центр по умолчанию (0, 0)
        this.color = color;
    }

    // 4. Конструктор с цветом
    public ColoredCircle(Color color) {
        super(); // Центр (0, 0), радиус 1
        this.color = color;
    }

    // 5. Конструктор по умолчанию
    public ColoredCircle() {
        super(); // Центр (0, 0), радиус 1
        this.color = Color.RED; // Цвет по умолчанию
    }


    // 6. Метод получения цвета
    public Color getColor() {
        return this.color;
    }

    // 7. Метод установки цвета
    public void setColor(Color color) {
        this.color = color;
    }

}
