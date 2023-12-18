package homework_3;

public class testBall {
    public static void main(String[] args){
        Ball bl = new Ball(100, 100);
        System.out.println(bl);
        bl.move(30,15);
        System.out.println(bl);
    }
}
