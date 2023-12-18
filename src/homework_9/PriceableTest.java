package homework_9;


// Интерфейс Priceable с методом getPrice()
interface Priceable {
    double getPrice();
}

// Пример класса, описывающего товар
class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Пример класса, описывающего автомобиль
class Auto implements Priceable {
    private String model;
    private double price;

    public Auto(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Пример класса, описывающего недвижимость
class RealEstate implements Priceable {
    private String location;
    private double price;

    public RealEstate(String location, double price) {
        this.location = location;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class PriceableTest {
    public static void main(String[] args) {
        // Создаем объекты разных классов, реализующих интерфейс Priceable
        Priceable product = new Product("Телевизор", 500.0);
        Priceable car = new Auto("Toyota Camry", 25000.0);
        Priceable realEstate = new RealEstate("Квартира в центре", 150000.0);

        // Вызываем метод getPrice() для каждого объекта и выводим их цены
        System.out.println("Цена товара: $" + product.getPrice());
        System.out.println("Цена автомобиля: $" + car.getPrice());
        System.out.println("Цена недвижимости: $" + realEstate.getPrice());
    }
}
