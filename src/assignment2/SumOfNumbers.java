package assignment2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please provide the first number.");
        int n = in.nextInt();

        int sum = 0;
        while (n != 0) {
            System.out.printf("The sum of numbers is %d.\nPlease provide the next number.\n", sum += n);
            n = in.nextInt();
        }
        System.out.println("Exiting program");
    }
}
