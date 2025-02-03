package quiz2;

public class Rect {
    private double x, y;
    private double length, width;

    public double[] centreCoordinates() {
        return new double[]{x + length/2, y + width/2};
    }

    public boolean containsPoint(double pointX, double pointY) {
        if (pointX < x + length && pointX > x && pointY < y + width && pointY > y) {
            return true;
        }
        return false;
    }

    public void scale(double scale) {
        x *= scale;
        y *= scale;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
    public double getArea() {
        return length * width;
    }
    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void changeSize(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void print() {
        System.out.println("Rectangle at (" + x + ", " + y + ")");
        System.out.println("length: " + length + " | width: " + width);
    }
}
