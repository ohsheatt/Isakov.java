package homework4;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 5);
        Circle circle2 = new Circle(10, 0, 8);

        System.out.println("Circle 1 area: " + circle1.getArea());
        System.out.println("Circle 2 area: " + circle2.getArea());

        System.out.println("Do the circles overlap? " + circle1.doesOverlap(circle2));
    }
}
