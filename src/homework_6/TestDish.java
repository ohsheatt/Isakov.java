package homework_6;

// Тестирование работы классов
public class TestDish {
    public static void main(String[] args) {
        // Создание объектов классов Plate и Cup
        Plate plate = new Plate("Керамика", 500, true);
        Cup cup = new Cup("Стекло", 250, true);

        // Вывод информации о посуде
        System.out.println("Вид: " + plate.getType() + ", Материал: " + plate.getMaterial() + ", Объем: " + plate.getCapacity() + ", Глубокая: " + plate.isDeep());
        System.out.println("Вид: " + cup.getType() + ", Материал: " + cup.getMaterial() + ", Объем: " + cup.getCapacity() + ", Имеет ручку: " + cup.isHasHandle());
    }
}