package assignment2;

public class PrimeNumberA {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) System.out.print(i + ", ");
        }
    }

    private static boolean isPrime(int n) {
        int i = 2;
        while (++i <= Math.sqrt(n)) if (n % i == 0) return false;

        return true;
    }
}
