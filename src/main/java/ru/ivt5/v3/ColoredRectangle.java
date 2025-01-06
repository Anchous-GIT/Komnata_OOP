package ru.ivt5.v3;

import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.iface.Colored;

import java.awt.*;

public class ColoredRectangle extends Rectangle implements Colored {

    private Color color;


    public ColoredRectangle(Point leftTop, Point rightBottom, Color color){
        super(leftTop, rightBottom);
        this.color = color;
    }

    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, Color color){
        super(xLeft,yTop,xRight,yBottom);
        this.color = color;
    }

    public ColoredRectangle(int length, int width, Color color){
        super(length,width);
        this.color = color;
    }

    public ColoredRectangle(Color color){
        this(1,1,color);
    }

    public ColoredRectangle(){
        this(Color.RED);
    }


    public Color getColor() {
        return color;
    }


    public void setColor(Color color) {
        this.color = color;
    }


}

