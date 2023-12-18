package homework1;

/*
public class testBook {    public static void main(String[]args){
    Book b1 = new Book("Гоголь", 8000);    Book b2 = new Book(90000);
    Book b3 = new Book();    b3.setActor("Блок");
    b3.setPrice(6000);    System.out.println(b3+" Рублей");
    b3.SellBook();    System.out.println(b2+" Рублей");
    b2.SellBook();    System.out.println(b1+" Рублей");
    b1.SellBook();
}
}*/

public class testBook {
    public static void main(String[] args) {
        Book bo1 = new Book("Green Lamp", "Alexander Grin" , 560);
        Book bo2 = new Book("Idiot", "Fedor Dostoevsky", 992);
        Book bo3 = new Book("Morphine" ,"Mikhail Bulgakov", 430);
        System.out.println(bo1);
        bo1.fullqr();
        bo2.fullqr();
        bo3.fullqr();
    }
}