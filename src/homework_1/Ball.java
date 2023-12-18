package homework1;

//public class Ball {    private int num;
//    private String typeSport;    public Ball(String t, int n) {
//        typeSport=t;        num = n;
//    }        public Ball(String t){
//        typeSport = t;        num = 1;
//    }    public Ball(){
//        typeSport = "Football";        num = 1;
//    }    public void setNum(int num){
//        this.num = num;
//    }    public void setTypeSport(String typeSport){
//        this.typeSport = typeSport;    }
//    public int getNum(){        return num;
//    }    public String getTypeSport(){
//        return typeSport;    }
//    public void Surprise(){        System.out.println("При покупке мяч в подарок "+ "Иотоговое кол-во мячей: "+ (num + 1) );
//    }    public String toString(){
//        return this.num +" "+ this.typeSport+" Мячей";    }
//}


 public class Ball {
    private String type;
    private int price;
    public Ball(String t, int p){
        type = t;
        price = p;
    }
    public Ball(String t){
        type = t;
        price = 0;
    }
    public Ball(){
        type = "Unknown";
        price = 0;
    }
    public void setSize(int price) {
        this.price = price;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType(String type){
        return type;
    }
    public int getPrice() {
        return price;
    }
    public String toString(){
        return this.type+", price "+this.price;
    }
    public void pricewhithdiscond(){
        System.out.println(type + " price ball with first discount  "+ price*0.8 + " ");
    }
}
