package homework_9;


// Интерфейс Nameable с методом getName()
interface Nameable {
    String getName();
}

// Пример класса, описывающего планету
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Пример класса, описывающего машину
class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Пример класса, описывающего животное
class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class NameableTest {
    public static void main(String[] args) {
        // Создаем объекты разных классов, реализующих интерфейс Nameable
        Nameable planet = new Planet("Земля");
        Nameable car = new Car("Toyota");
        Nameable animal = new Animal("Собака");

        // Вызываем метод getName() для каждого объекта и выводим их имена
        System.out.println("Планета: " + planet.getName());
        System.out.println("Машина: " + car.getName());
        System.out.println("Животное: " + animal.getName());
    }
}
