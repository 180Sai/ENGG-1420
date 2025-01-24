package assignment3;

public class Program {
    public static void main(String[] args) {
        Rect rectangle = new Rect();

        rectangle.move(3, 5);
        rectangle.changeSize(15, 19);
        rectangle.print();
        System.out.println("Area: " + rectangle.getArea()
                + " | Perimeter: " + rectangle.getPerimeter());
    }
}
