package assignment2;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 2;
        while (++n <= 1000) {
            if (isPrime(n)) System.out.println(n);
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            switch (n % i) {
                case 0:
                    return false;
            }
        }

        return true;
    }
}
