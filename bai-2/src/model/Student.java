package model;

import java.util.Map;

public class Student {
    // Thuộc tính
    private String name; // thuộc tính
    private int age; // thuộc tính

    public static String school = "YKA";

    public static int counter;

    static {
        System.out.println("Khoi static: " + counter);
        counter = 10;
    }

    //Default constructor
//    public Student() {
//        name = "Mặc định" ;
//    }


    public Student() {
        counter++;
    }

    public Student(String name) {
        //Logic khoi tao name rat phuc tap
        this.name = "Nguyen " + name;
        counter++;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student getThis() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Hành vi
    public static void learnStatic() {
        System.out.println("Sinh vien " + counter + " dang hoc");
    }

    //Hành vi
    public String learn() {
        String s = "";
        System.out.println("Sinh vien " + name + " dang hoc");
        return s;
    }

    public String learn(String s) {
        System.out.println("Sinh vien " + name + " dang hoc");
        return s;
    }

    public String learn(int s1) {
        //logic +/-
        System.out.println("Sinh vien " + name + " dang hoc");
        return "";
    }

    //Hành vi
    public void learnPublic() {
        System.out.println("Sinh vien " + name + " dang hoc");
    }
}
