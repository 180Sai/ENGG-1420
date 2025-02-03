package assignment4;

public class Rect {
    private int x, y;
    private int length, width;

    public Rect(int l, int w) {
        length = l;
        width = w;
    }
    public Rect(int l, int w, int posX, int posY) {
        this(l, w);
        x = posX;
        y = posY;
    }

    public boolean isBiggerthan(Rect that) {
        return this.length * this.width > that.length * that.width;
    }
}
