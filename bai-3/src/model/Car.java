package model;

/*
Day la class Car (oto) ke thua tu
*/
public class Car extends Vehicle {
    String name;
    String color;

    public Car(String color, int year, String code) {
        super(color, year, code);
    }

    public Car(String color, int year, String code, String name) {
        this(color, year, code);
        this.name = name;
    }

    public void printCarDetail() {
        super.printDetail(); // in chi tiet
        System.out.println("Goi tu car " + super.color);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
