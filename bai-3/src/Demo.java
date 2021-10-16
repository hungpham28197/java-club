import model.Car;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Red", 2021, "0A1", "Test");
        car.printCarDetail();

        //car.setName("Oto");

        System.out.println(car.getName());
        System.out.println(car.getColor());
    }
}
