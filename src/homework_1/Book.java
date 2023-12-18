package homework1;
/*
public class Book {    private String actor;
    private int price;    public  Book(String a, int p){
        actor = a;        price = p;
    }    public Book(int p){
        actor = "Пушкин";        price = p;
    }    public Book(){
        actor = "Есенин";        price = 500;
    }    public void setActor(String actor){
        this.actor = actor;    }
    public void setPrice(int price){        this.price = price;

    }
    public String getActor() {        return actor;
    }
    public int getPrice() {        return price;
    }    public String toString(){
        return this.actor +" " +this.price;    }
    public void SellBook(){        System.out.println("На все книги действует скидка 10% стоимость книги: "+ (price-((price*10)/100)) +" Рублей" );
    }
}*/

public class Book {
    private String title;
    private String author;
    private int price;
    public Book(String t, String a, int p){
        title = t;
        author = a;
        price = p;
    }
    public Book(String t, String a){
        title = t;
        author = a;
        price = 0;
    }
    public Book(){
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(String title){
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(String author){
        return author;
    }
    public int getPrice() {
        return price;
    }
    public String toString(){
        return this.title + " by " + this.author + ", price " + this.price;
    }
    public void fullqr(){
        System.out.println(title + " book written "+ author + " discount price " + price*0.87);
    }
}
