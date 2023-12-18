package homework_6;

abstract class Dish {
    protected String material; // Материал посуды
    protected int capacity; // Вместимость посуды

    // Конструктор по умолчанию
    public Dish() {
        this.material = "Unknown";
        this.capacity = 0;
    }

    // Конструктор с параметрами
    public Dish(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    // Абстрактный метод, возвращающий тип посуды
    public abstract String getType();

    // Геттеры и сеттеры для полей класса
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

// Класс, описывающий тарелку
class Plate extends Dish {
    private boolean isDeep; // Глубокая ли тарелка

    // Конструктор по умолчанию
    public Plate() {
        super();
        this.isDeep = false;
    }

    // Конструктор с параметрами
    public Plate(String material, int capacity, boolean isDeep) {
        super(material, capacity);
        this.isDeep = isDeep;
    }

    // Переопределение метода getType
    public String getType() {
        return "Тарелка";
    }

    // Геттеры и сеттеры для поля isDeep
    public boolean isDeep() {
        return isDeep;
    }

    public void setDeep(boolean deep) {
        isDeep = deep;
    }
}

// Класс, описывающий кружку
class Cup extends Dish {
    private boolean hasHandle; // Есть ли у кружки ручка

    // Конструктор по умолчанию
    public Cup() {
        super();
        this.hasHandle = false;
    }

    // Конструктор с параметрами
    public Cup(String material, int capacity, boolean hasHandle) {
        super(material, capacity);
        this.hasHandle = hasHandle;
    }

    // Переопределение метода getType
    public String getType() {
        return "Кружка";
    }

    // Геттеры и сеттеры для поля hasHandle
    public boolean isHasHandle() {
        return hasHandle;
    }

    public void setHasHandle(boolean hasHandle) {
        this.hasHandle = hasHandle;
    }
}

