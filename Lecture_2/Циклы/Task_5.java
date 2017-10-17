// Факториал числа

package Циклы;


import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        System.out.println("Введите натуральное число: ");

        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();

        int result = 1;
        for (int i = 1; i<=n; i++) {
            result *= i;
        }

        System.out.println(result);
    }

}
