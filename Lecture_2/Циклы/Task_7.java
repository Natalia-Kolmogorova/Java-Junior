// Является ли число простым?

package Циклы;


import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        System.out.println("Введите натуральное число: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; i<n; i++) {
            if (n % i == 0) {
                System.out.println("Число является составным");
                return;
            }
        }

        System.out.println("Число является простым");
    }
}
