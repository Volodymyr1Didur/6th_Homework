package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Shape shape = new Rectangle(new Point(3,4),new Point(7,6));
        Shape shape2 = new Circle(new Point(3,5), 5);
        System.out.println(shape);
        System.out.println(shape2);
    }
}
