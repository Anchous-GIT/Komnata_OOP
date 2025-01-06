package ru.ivt5.v2;

import org.jetbrains.annotations.NotNull;
import ru.ivt5.v2.iface.HasArea;
import ru.ivt5.v2.iface.Stretchable;

public class Rectangle extends Figure implements Stretchable, HasArea {

    private Point topLeft; // Левая верхняя вершина
    private Point bottomRight; // Правая нижняя вершина

    // Конструктор 1: по двум точкам
    public Rectangle(Point topLeft, Point bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Конструктор 2: по координатам
    public Rectangle(int xLeft, int yTop, int xRight, int yBottom){
        this.topLeft = new Point(xLeft,yTop);
        this.bottomRight = new Point(xRight,yBottom);
    }

    // Конструктор 3: по длине и ширине
    public Rectangle(int length, int width){
        this.topLeft = new Point(0,0);
        //noinspection SuspiciousNameCombination
        this.bottomRight = new Point(length,width);
    }

    // Конструктор 4: Без параметров
    public Rectangle(){
        this.topLeft = new Point(0,0);
        this.bottomRight = new Point(1,1);
    }

    // 5. Геттер: возвращает значение topLeft
    public Point getTopLeft() {
        return this.topLeft;
    }

    // 6. Геттер: возвращает значение BottomRight
    public Point getBottomRight() {
        return bottomRight;
    }

    // 7. Сеттер для topLeft
    void setTopLeft(Point topLeft){
        this.topLeft = topLeft;
    }

    // 8. Сеттер для bottomRight
    void setBottomRight(Point bottomRight){
        this.bottomRight = bottomRight;
    }

    // 9. Метод для получения длины
    public int getLength(){
        return bottomRight.getX() - topLeft.getX();
    }

    // 10. Метод для получения ширины
    public int getWidth(){
        return topLeft.getY() - bottomRight.getY();
    }

    // 11. Передвинуть Rectangle в точку (х, у)
    void moveTo(int x, int y){
        int length = getLength();
        int width = getWidth();
        this.topLeft = new Point(x, y);
        this.bottomRight = new Point(x + length, y + width);
    }

    /* 12. Передвинуть Rectangle в точку point
    void moveTo(Point point){
        moveTo(point.getX(), point.getY());
    }

     */

    // 13. Передвинуть Rectangle на (dx, dy)
    void moveRel(int dx,int dy){
        this.topLeft = new Point(topLeft.getX()+dx, topLeft.getY()+ dy);
        this.bottomRight = new Point(bottomRight.getX()+dx, bottomRight.getY()+dy);
    }

    // 14. Изменить стороны в ratio раз Rectangle(изменить размер(соотношение))
    public void resize(double ratio){
        int newLength = (int) (getLength() * ratio);
        int newWidth = (int) (getWidth() * ratio);
        this.bottomRight = new Point(topLeft.getX() + newLength, bottomRight.getY() + newWidth);
    }

    // 15. Изменить стороны
    public void stretch(double xRatio, double yRatio){
        int newLength = (int) (getLength() * xRatio);
        int newWidth = (int) (getWidth() * yRatio);
        this.bottomRight = new Point(topLeft.getX() + newLength, bottomRight.getY() + newWidth);
    }

    // 16. Площадь прямоугольника
    public double getArea(){
        return getLength() * getWidth();
    }

    // 17. Периметр
    public double getPerimeter(){
        return  getLength() + getWidth();
    }

    // 18. Расположение точки (х,у) внутри/снаружи прямоугольника
    // помним, что ось у направлена вниз
    public boolean isInside(int x, int y){
        return x >= topLeft.getX() && x >= bottomRight.getX() && y >= topLeft.getY() && y <= bottomRight.getY();
    }

    // 19.Расположение точки point внутри/снаружи прямоугольника
    public boolean isInside(Point point){
        return isInside(point.getX(), point.getY());
    }

    // 20. Пересечение с другим прямоугольником
    public boolean isIntersects(Rectangle rectangle) {
        return !(rectangle.getBottomRight().getX() < this.topLeft.getX() || rectangle.getTopLeft().getX() > this.bottomRight.getX() || rectangle.getBottomRight().getY() < this.topLeft.getY() || rectangle.getTopLeft().getY() > this.bottomRight.getY());
    }

    // 21. Полностью внутри другого прямоугольника
    public boolean isInside(Rectangle rectangle) {
        return rectangle.getTopLeft().getX() >= this.topLeft.getX() && rectangle.getBottomRight().getX() <= this.bottomRight.getX() && rectangle.getTopLeft().getY() >= this.topLeft.getY() && rectangle.getBottomRight().getY() <= this.bottomRight.getY();
    }
}
