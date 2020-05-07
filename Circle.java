package BT_interface_Resizeable;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent){
        this.radius = this.radius*(percent/100);
    }
}
