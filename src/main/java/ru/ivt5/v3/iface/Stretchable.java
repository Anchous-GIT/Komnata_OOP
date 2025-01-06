package ru.ivt5.v3.iface;

//Растягивает фигуру
public interface Stretchable extends Resizable {
    void stretch(double xRatio, double yRatio);
}
