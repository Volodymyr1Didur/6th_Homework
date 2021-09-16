package com.company;



public class Circle extends Shape{

    private double radius;
    private Point center;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public Circle(double xCoordinate, double yCoordinate, double radius){
        this.center = new Point(xCoordinate, yCoordinate);
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double perimeter() {
        return Math.PI * radius;
    }

    @Override
    public void move(double dx, double dy) {
        center.setX( center.getX() + dx );
        center.setY( center.getY() + dy );
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public String toString(){
        return "Circle{" + "Center = " + center + ", Radius = " + radius + super.toString() + "}";
    }
}
