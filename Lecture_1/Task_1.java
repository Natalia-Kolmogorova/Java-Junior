// Деление q на w с остатком

import java.util.Scanner;

public class Task_1 {

    public static void main (String[] args) {

        System.out.println("Введите два натуральных числа");

        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        int w = scanner.nextInt();

        int z = q/w;
        int k = q % w;

        System.out.println(q + " / " + w + " = " + z + " и " + k + " в остатке");

    }
}
