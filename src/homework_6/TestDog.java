package homework_6;

public class TestDog {
    public static void main(String[] args) {
        Labrador labrador = new Labrador(3, "Golden");
        Poodle poodle = new Poodle(2, "White");
        Ovcharka ovcharka = new Ovcharka(1, "Brown");

        labrador.bark();
        labrador.run();

        poodle.bark();
        poodle.run();

        ovcharka.bark();
        ovcharka.run();

    }
}