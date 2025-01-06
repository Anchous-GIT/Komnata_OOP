package ru.ivt5.v3;

import ru.ivt5.v3.iface.HasArea;
import ru.ivt5.v3.iface.Resizable;

public class Square extends Figure implements Resizable, HasArea {
    private Point leftTop;// ссылка на объект класса
    private int size;

    // Конструктор 1.Квадрат по координате левого верхнего угла и длине
    public Square(Point leftTop, int size){
        this.leftTop = leftTop;
        this.size = size;
    }

    // Конструктор 2. По координате левого верхнего угла и длине
    public Square(int xLeft, int yTop, int size){
        this.leftTop = new Point(xLeft,yTop);
        this.size = size;
    }

    // Конструктор 3. По длине стороны
    public Square(int size){
        this.leftTop = new Point();
        this.size = size;
    }

    // Конструктор 4. Без данных
    public Square(){
        this.size = 1;
        this.leftTop = new Point();
    }

    // 5. Геттер
    public Point getLeftTop(){
        return leftTop;
    }

    // 6.
    public Point getBottomRight(){
        return new Point(leftTop.getX() + size, leftTop.getY()+size);
    }

    // 7. Устанавливает leftTop
    public void setTopLeft(Point topLeft){
        this.leftTop = topLeft;
    }

    // 8. Геттер
    public int getLength(){
        return size;
    }

    // 9. Передвигает в точку (х,у)
    public void moveTo(int x, int y){
        this.leftTop = new Point(x,y);
    }

    /* 10. Передвигает в точку point
    public void moveTo(Point point){
        this.leftTop = point;
    }

     */

    // 11. Передвигает на (dx, dy)
    public void moveRel(int dx, int dy){
        this.leftTop = new Point(leftTop.getX() + dx, leftTop.getY()+dy);
    }

    // 12. Изменяет обе стороны
    public void resize(double ratio){
        if (ratio <= 0){
            throw new IllegalArgumentException("Коэффициента должен быть положительным и больше нуля");
        }
        this.size = (int) (size * ratio);
    }

    // 13. Возвращает площадь
    public double getArea(){
        return size*size;
    }

    // 14. Периметр
    public double getPerimeter(){
        return size*4;
    }

    // 15. Определяет, лежит ли точка (x, y)
    public boolean isInside(int x, int y){
        return x >= this.leftTop.getX() && y <= this.leftTop.getY() && x <= this.leftTop.getX()+size && y >= this.leftTop.getY()+size;
    }

    // 16. Определяет, лежит ли точка point
    public boolean isInside(Point point){
        return isInside(point.getX(), point.getY());
    }

    // 17. Определяет, пересекается ли Square с другим Square.
    public boolean isIntersects(Square square){
        return this.leftTop.getX() > square.getBottomRight().getX() || // Текущий квадрат справа от другого
                this.getBottomRight().getX() < square.getLeftTop().getX() || // Текущий квадрат слева от другого
                this.leftTop.getY() > square.getBottomRight().getY() || // Текущий квадрат ниже другого
                this.getBottomRight().getY() < square.getLeftTop().getY();// Текущий квадрат выше другого
    }

    // 18. Определяет, лежит ли Square целиком внутри текущего Square.
    public boolean isInside(Square square){
        return this.leftTop.getX() <= square.getBottomRight().getX() &&
                this.getBottomRight().getX() >= square.getLeftTop().getX() &&
                this.leftTop.getY() <= square.getBottomRight().getY() &&
                this.getBottomRight().getY() >= square.getLeftTop().getY();
    }
}
