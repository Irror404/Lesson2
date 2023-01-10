package lesson02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число:");
        n = in.nextInt();
        int d1 = n % 10;
        int d2 = (n % 100 ) / 10;
        int d3 = n / 100;
        System.out.println("Cумма цифр числа:" + (d1 + d2 + d3));

    }
}
