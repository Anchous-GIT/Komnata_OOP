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

    // 7.
    public int getYAxis() {
        return yAxis;
    }

    public void setXAxis(int xAxis){
        this.xAxis = xAxis;
    }

    public void setYAxis(int yAxis){
        this.yAxis = yAxis;
    }

    public void setCenter(Point center){
        this.center = center;
    }

    public void moveTo(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    public void moveTo(Point point){
        this.center = point;
    }

    public void moveRel(int dx, int dy){
        this.center = new Point(this.center.getX()+dx, this.center.getY()+dy);

    }

    public void resize(double ratio){
        this.xAxis = (int) (this.xAxis * ratio);
        this.yAxis = (int) (this.yAxis  * ratio);
    }

    public void stretch(double xRatio, double yRatio){
        this.xAxis = (int) (xAxis * xRatio);
        this.yAxis = (int) (yAxis * yRatio);
    }

    public double getArea(){
        return Math.PI * xAxis*yAxis;
    }

    public double getPerimeter(){
        return 2 * Math.PI * Math.sqrt((Math.pow(this.xAxis, 2) + Math.pow(this.yAxis, 2)) / 8);
    }

    public boolean isInside(int x, int y) {
        double dx = (x - this.center.getX()) / (double) this.xAxis;
        double dy = (y - this.center.getY()) / (double) this.yAxis;
        return dx * dx + dy * dy <= 1;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }








}
