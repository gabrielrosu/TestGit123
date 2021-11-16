package curs2;

public class Rectangle {

    // variabile de clasa
    private int length;
    private int width;
    private int bigArea;

    //constructor
    public Rectangle(){
//        length = 1;
//        width = 1;
    }

    //constructor 2// cu parametrii
    public Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
    }

    //constructor 3
    public Rectangle(int length, int width, int bigArea){
        setLength(length);
        setWidth(width);
        this.bigArea = bigArea;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea(){
        return length*width;
    }

    public int calculateNrOfRectangles(){
        return bigArea/calculateArea();
    }
}
