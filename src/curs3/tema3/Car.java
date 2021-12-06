package curs3.tema3;

public class Car {
    public static String brand;
    public static String type = "SUV";
    public static String engine;


    public Car(String brand, String engine){
        this.brand = brand;
        this.engine = engine;
    }

    public static String carDetails(){
        return "All " + brand + " cars are " + engine + " and are of type " + type;
    }
}
