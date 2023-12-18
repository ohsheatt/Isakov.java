package homework_6;

public class TestFurniture {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(5);

        Furniture chair1 = new Chair("Стул №1", 100);
        Furniture chair2 = new Chair("Стул №2", 80);
        Furniture table1 = new Table("Стол №1", 200);

        shop.addFurniture(chair1, 0);
        shop.addFurniture(chair2, 1);
        shop.addFurniture(table1, 2);

        shop.displayInventory();
    }
}