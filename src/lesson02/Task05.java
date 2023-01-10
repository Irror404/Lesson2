package lesson02;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        double x;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:" );
        x = Double.parseDouble(in.nextLine());
        if ((x % 1)==0){
            System.out.println("Число целое");
        }else {
            System.out.println("Число с вещественной частью");
        }

    }
}
