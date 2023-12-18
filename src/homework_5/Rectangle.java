package homework_5;
public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.width = 5.3;
        this.length = 7.4;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length,String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override    public double getPerimeter() {
        return (width + length) * 2;
    }
    @Override
    public String toString() {
        return " Shape: Rectangle, width: " + this.width + ", length: " + this.length;
    }
}