package lesson02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        double r;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус:");
        r = Double.parseDouble(in.nextLine());
        System.out.println("Вывести площадь круга:" + 2 * Math.PI * r );
        System.out.println("Вывести длину окружности:" + Math.PI * Math.pow(r,2.0));
    }
}
