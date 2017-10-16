// Петров и секунды

package Ветвление_в_программе;


import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n < 0 || n > 28800) {
            System.out.println("Введите число в диапазоне от 0 до 28800");
            n = scanner.nextInt();
        }

        if (n == 0) {
            System.out.println("Конец рабочего дня!");
        } else {
            int hours = n / 3600;

            if (hours >= 1) {
                System.out.println("Осталось " + hours + " час (-a, -ов)");
            } else {
                System.out.println("Осталось менее часа");
            }
        }
    }
}
