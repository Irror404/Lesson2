package lesson02;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        double w;
        double h;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ширину:");
        w = Double.parseDouble(in.nextLine());
        System.out.println("Введите высоту:");
        h = Double.parseDouble(in.nextLine());
        System.out.println("Вывести периметр:" + 2*(w+h));
        System.out.println("Вывести площадь:" + w*h);
    }
}
