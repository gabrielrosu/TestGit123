package curs2;

public class Shape {

    public int calculateSquareArea(int length){
        return length * length;
    }

    public int calculateRectangleArea(int lenght, int width) {
        return lenght * width;
    }

    public Shape(int length){
        System.out.println("The area of the square is: " + calculateSquareArea(length));
    }

    public Shape(int length, int width){
        System.out.println("The area of the rectangle is: " + calculateRectangleArea(length, width));
    }

    public Shape(double radius) {
        double areaOfCircle = radius * radius * Math.PI;
        System.out.println("The area of the circle is: " + areaOfCircle);
    }
}
