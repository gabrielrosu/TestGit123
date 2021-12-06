package curs3.tema3;

public class TestCar {

    public static void main(String[] args) {
        Car object = new Car("BMW", "2.0");
        System.out.println(object.carDetails());

        Car object2 = new Car("Mercedes", "5.0");
        object2.type = "Sedan";
        System.out.println(object2.carDetails());
        System.out.println(object.carDetails());
    }
}
