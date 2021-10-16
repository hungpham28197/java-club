package abstracts;

public class Cat extends Animal{
    @Override
    void move() {
        System.out.println(getClass().getSimpleName() + " dang di chuyen");
    }

    @Override
    void makeSound() {
        System.out.println("Meo meo");
    }
}
