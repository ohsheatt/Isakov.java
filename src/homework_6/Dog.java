package homework_6;

abstract class Dog {
    String breed;
    int age;
    String color;

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public abstract void bark();
    public abstract void run();
}

class Labrador extends Dog {
    public Labrador(int age, String color) {
        super("Labrador", age, color);
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void run() {
        System.out.println("Labrador is running.");
    }
}

class Poodle extends Dog {
    public Poodle(int age, String color) {
        super("Poodle", age, color);
    }

    public void bark() {
        System.out.println("Yap!");
    }

    public void run() {
        System.out.println("Poodle is running.");
    }
}
class Ovcharka extends Dog {
    public Ovcharka(int age, String color) {
        super("Ovcharka", age, color);
    }

    public void bark() {
        System.out.println("Bark!");
    }

    public void run() {
        System.out.println("Ovcharka is running.");
    }
}

