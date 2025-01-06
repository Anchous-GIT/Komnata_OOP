package ru.ivt5.v3;

import ru.ivt5.v3.iface.HasArea;
import ru.ivt5.v3.iface.Movable;
import ru.ivt5.v3.iface.Resizable;

import java.util.Objects;

public class Triangle extends Figure implements Movable, HasArea, Resizable {

    //три вершины треугольника
    private Point vertexA;
    private Point vertexB;
    private Point vertexC;

    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    public Point getVertexA() {
        return vertexA;
    }

    public void setVertexA(Point vertexA) {
        this.vertexA = vertexA;
    }

    public Point getVertexB() {
        return vertexB;
    }

    public void setVertexB(Point vertexB) {
        this.vertexB = vertexB;
    }

    public Point getVertexC() {
        return vertexC;
    }

    public void setVertexC(Point vertexC) {
        this.vertexC = vertexC;
    }


    public double getArea() {
        // Используем формулу площади треугольника через координаты
        return Math.abs(
                (vertexA.getX() * (vertexB.getY() - vertexC.getY()) +
                        vertexB.getX() * (vertexC.getY() - vertexA.getY()) +
                        vertexC.getX() * (vertexA.getY() - vertexB.getY())) / 2.0
        );
    }


    public double getPerimeter() {
        // Вычисляем расстояние между каждой парой вершин
        double sideAB = Math.sqrt(Math.pow(vertexA.getX() - vertexB.getX(), 2) + Math.pow(vertexA.getY() - vertexB.getY(), 2));
        double sideBC = Math.sqrt(Math.pow(vertexB.getX() - vertexC.getX(), 2) + Math.pow(vertexB.getY() - vertexC.getY(), 2));
        double sideCA = Math.sqrt(Math.pow(vertexC.getX() - vertexA.getX(), 2) + Math.pow(vertexC.getY() - vertexA.getY(), 2));

        return sideAB + sideBC + sideCA;
    }

    public void moveTo(int x, int y) {
        // Вычисляем смещение для каждой вершины
        int dxA = x - vertexA.getX();
        int dyA = y - vertexA.getY();
        int dxB = x - vertexB.getX();
        int dyB = y - vertexB.getY();
        int dxC = x - vertexC.getX();
        int dyC = y - vertexC.getY();

        // Перемещаем каждую вершину на новое место
        this.vertexA = new Point(vertexA.getX() + dxA, vertexA.getY() + dyA);
        this.vertexB = new Point(vertexB.getX() + dxB, vertexB.getY() + dyB);
        this.vertexC = new Point(vertexC.getX() + dxC, vertexC.getY() + dyC);
    }

    public void moveRel(int dx, int dy) {
        // Смещаем каждую вершину треугольника
        vertexA = new Point(vertexA.getX() + dx, vertexA.getY() + dy);
        vertexB = new Point(vertexB.getX() + dx, vertexB.getY() + dy);
        vertexC = new Point(vertexC.getX() + dx, vertexC.getY() + dy);
    }
    public void resize(double ratio) {
        if (ratio <= 0) {
            throw new IllegalArgumentException("Коэффициент должен быть положительным и больше нуля");
        }
        // Изменяем координаты каждой вершины, умножая на коэффициент
        vertexA = new Point((int)(vertexA.getX() * ratio), (int)(vertexA.getY() * ratio));
        vertexB = new Point((int)(vertexB.getX() * ratio), (int)(vertexB.getY() * ratio));
        vertexC = new Point((int)(vertexC.getX() * ratio), (int)(vertexC.getY() * ratio));
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return vertexA.equals(triangle.vertexA) &&
                vertexB.equals(triangle.vertexB) &&
                vertexC.equals(triangle.vertexC);
    }

    public int hashCode() {
        return Objects.hash(vertexA, vertexB, vertexC);
    }

}