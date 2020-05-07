package BT_interface_Resizeable;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.floor(Math.random()*100));

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", false, 4.5);
        shapes[1] = new Rectangle("red", true, 7.9, 5.6);
        shapes[2] = new Square("pink", true, 10.2);

        System.out.println("Before: ");
        for (Shape elements : shapes){
            System.out.println(elements.toString());
        }

        System.out.println("After: ");
        for (Shape elements : shapes){
            elements.resize(randomNumber);
            System.out.println(elements.toString());
        }
    }
}