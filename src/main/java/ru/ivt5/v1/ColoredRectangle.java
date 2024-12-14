package ru.ivt5.v1;

public class ColoredRectangle extends Rectangle {

    private int color;


    public ColoredRectangle(Point leftTop, Point rightBottom, int color){
        super(leftTop, rightBottom);
        this.color = color;
    }

    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, int color){
        super(xLeft,yTop,xRight,yBottom);
        this.color = color;
    }

    public ColoredRectangle(int length, int width, int color){
        super(length,width);
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
