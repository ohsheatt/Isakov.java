package homework_5;

public class Square extends Rectangle{
    protected double side;
    public Square(){
        this.side = 4.0;
    }
    public Square(double side){
        this.side = side;
        this.color = "WHITE";
    }
    public Square(double side, String color,boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override    public double getArea() {
        return side*side;
    }
    @Override
    public String toString() {
        return "Shape: Square, side: " + this.side + ", color: " + this.color;
    }
}