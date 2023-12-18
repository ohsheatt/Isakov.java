package homework1;

/*

public class testball {    public static void main(String[] args){
    Ball b1 = new Ball("Volleyball", 3);        Ball b2 = new Ball("Handball");
    Ball b3 = new Ball();        b3.setNum(9);
    b2.setNum(5);        System.out.println("\n"+b3.toString());
    b3.Surprise();        System.out.println("\n"+b2.toString());
    b2.Surprise();        System.out.println("\n"+b1.toString());
    b1.Surprise();    }
}*/





public class testball {
    public static void main(String[] args) {
        Ball b1 = new Ball("BasketBall", 3000);
        Ball b2 = new Ball("VolleyBall", 4120);
        Ball b3 = new Ball("FootBall" , 5234);
        System.out.println(b1);
        b1.pricewhithdiscond();
        b2.pricewhithdiscond();
        b3.pricewhithdiscond();
    }
}