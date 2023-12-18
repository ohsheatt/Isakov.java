package homework_6;

// Абстрактный класс, описывающий мебель
abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Абстрактный метод для вывода информации о мебели
    public abstract void displayInfo();
}

// Классы, представляющие различные виды мебели (наследники класса Furniture)
class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + getName() + ", Цена: " + getPrice() + " руб.");
    }
}

class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол: " + getName() + ", Цена: " + getPrice() + " руб.");
    }
}

// Класс моделирующий магазин мебели
class FurnitureShop {
    private Furniture[] inventory;

    public FurnitureShop(int capacity) {
        inventory = new Furniture[capacity];
    }

    // Метод для добавления мебели в магазин
    public void addFurniture(Furniture furniture, int index) {
        if (index >= 0 && index < inventory.length) {
            inventory[index] = furniture;
        } else {
            System.out.println("Недопустимый индекс для добавления мебели.");
        }
    }

    // Метод для вывода информации о всей мебели в магазине
    public void displayInventory() {
        System.out.println("Инвентарь магазина мебели:");
        for (Furniture furniture : inventory) {
            if (furniture != null) {
                furniture.displayInfo();
            }
        }
    }
}

