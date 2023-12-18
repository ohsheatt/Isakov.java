package homework_5;

public class Circle extends Shape {
    protected double radius;
    public Circle() {
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }
    public Circle(double radius) {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius() {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {        return "Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }
}