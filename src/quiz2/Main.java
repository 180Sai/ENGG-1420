package quiz2;

import quiz2.Rect;

public class Main {
    public static void main(String[] args) {
        Rect rectangle = new Rect();

        rectangle.move(3, 5);
        rectangle.changeSize(15, 19);
        rectangle.print();
        System.out.println("Area: " + rectangle.getArea()
                + " | Perimeter: " + rectangle.getPerimeter());

        double coord[] = {15, 19};
        System.out.println("Contains point (" + coord[0] + ", " + coord[1]
                + "): " + rectangle.containsPoint(coord[0], coord[1]));

        rectangle.scale(3);
        System.out.println("Scaled by 3, new centre at (" + rectangle.centreCoordinates()[0]
                + ", " + rectangle.centreCoordinates()[1] + ")");
    }
}
