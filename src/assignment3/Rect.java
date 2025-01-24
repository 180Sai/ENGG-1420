package assignment3;

class Rect {
    private int length, width;
    private int x, y;

    public int getPerimeter() {
        return 2 * (length + width);
    }
    public int getArea() {
        return length * width;
    }
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void changeSize(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void print() {
        System.out.println("length: " + length + " | width: " + width);
        System.out.println("posX: " + x + " | posY: " + y);
    }
}