// Все положительные делители натурального числа

package Циклы;


import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        System.out.println("Введите натуральное число: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i<=n; i++) {

            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }
}