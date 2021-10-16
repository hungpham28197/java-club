import abstracts.Animal;
import abstracts.Cat;
import abstracts.Dog;

public class Demo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.move();
        dog.makeSound();

        Animal cat = new Cat();
        cat.move();
        cat.makeSound();
    }
}
