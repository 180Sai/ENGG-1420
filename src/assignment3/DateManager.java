package assignment3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateManager {
    int year, month, day;
    LocalDate date;

    public DateManager(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.date = LocalDate.of(year, month, day);
    }

    public void print() {
        System.out.printf("Date: %s\n", date);
    }

    public void add(int n) {
        date = date.plusDays(n);
        this.year = date.getYear();
        this.month = date.getMonthValue();
        this.day = date.getDayOfMonth();
    }

    public long compare(DateManager other) {
        return ChronoUnit.DAYS.between(this.date, other.date);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year, month, and day: ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        DateManager d = new DateManager(year, month, day);

        LocalDate today = LocalDate.now();
        DateManager todayDate = new DateManager(today.getYear(), today.getMonthValue(), today.getDayOfMonth());
        long daysBetween = todayDate.compare(d);
        System.out.println("Days between today and entered date: " + daysBetween);

        d.add(10);
        d.print();
        sc.close();
    }
}
