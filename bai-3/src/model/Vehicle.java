package model;

public class Vehicle {
    String color;
    protected int year;
    private String code;

//    public Vehicle() {
//    }
//
    public Vehicle(String color, int year, String code) {
        this.color = color;
        this.year = year;
        this.code = code;
    }

     protected void printDetail() {
        System.out.println("Color: " + this.color);
        System.out.println("Year: " + this.year);
        System.out.println("Code: " + this.code);
    }
}
