package curs2;

public class TestRectangle {

    public static   void main (String[] args){
        Rectangle rectangle1 = new Rectangle();
        System.out.println("rectangle 1: " + rectangle1.calculateArea());

        rectangle1.setLength(3);
        System.out.println("rectangle 2: " + rectangle1.calculateArea());
        rectangle1.setWidth(2);
        System.out.println("rectangle 3: " + rectangle1.calculateArea());

        Rectangle rectangle2 = new Rectangle();
        System.out.println("rectangle 4: " + rectangle2.calculateArea());

        Rectangle rectangle3 = new Rectangle(3,5);
        System.out.println("rectangle 5: " + rectangle3.calculateArea());
        System.out.println("rectangle 6: " + rectangle1.calculateArea());

        Rectangle rectangle4 = new Rectangle(5, 2, 40);
        System.out.println(rectangle4.calculateNrOfRectangles());
    }
}
