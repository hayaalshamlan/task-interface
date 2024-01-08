
import model.Cat;
import model.Dog;

public class App {
    public static void main(String[] args) throws Exception {

        Cat zytona = new Cat();
        Dog pippa = new Dog();

        zytona.eat();
        zytona.sleep();
        zytona.makeSound();

        pippa.eat();
        pippa.sleep();
        pippa.makeSound();

    }
}
