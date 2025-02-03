package assignment4;

public class Main {
    public static void main(String[] args) {
        Rect oneRect = new Rect(3, 5);
        Rect twoRect = new Rect(3, 5, 10, 9);

        System.out.println(oneRect.isBiggerthan(twoRect));
    }
}
