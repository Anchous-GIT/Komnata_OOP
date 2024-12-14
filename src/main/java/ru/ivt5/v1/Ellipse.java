package ru.ivt5.v1;

public class Ellipse {
    private Point center;
    private int xAxis;
    private  int yAxis;

    public Ellipse(Point center, int xAxis, int yAxis){
        this.center = center;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis){
        this.center = new Point(xCenter,yCenter);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public  Ellipse(int xAxis, int yAxis){
        this.center = new Point(0,0);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(){
        this.center = new Point(0,0);
        this.xAxis = 1;
        this.yAxis = 1;
    }

    public Point getCenter(){
        return this.center;
    }

    public int getXAxis() {
        return xAxis;
    }

    public int getYAxis() {
        return yAxis;
    }


}
