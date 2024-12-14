package ru.ivt5.v1;

public class ColoredRectangle {

    private Point leftTop;
    private Point rightBottom;
    private int color;


    public ColoredRectangle(Point leftTop, Point rightBottom, int color){
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
        this.color = color;
    }

    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, int color){
        this.leftTop = new Point(xLeft,yTop);
        this.rightBottom = new Point(xRight,yBottom);
        this.color = color;
    }

    public ColoredRectangle(int length, int width, int color){
        this.leftTop = new Point(0, 0);
        this.rightBottom = new Point(length, -width);
        this.color = color;
    }

    public ColoredRectangle(int color){
        this(1,1,color);
    }

    public ColoredRectangle(){
        this(1);
    }

    public int getColor() {
        return color;
    }


    public void setColor(int color) {
        this.color = color;
    }


}
