// Округление n до ближайшего целого числа

import java.util.Scanner;

public class Task_3 {

    public static void main (String[] args) {

        System.out.println("Введите вещественное число с ненулевой дробной частью");

        Scanner scanner = new Scanner (System.in);

        double n = scanner.nextDouble();

        int n1 = (int) n;

        double n2 = n - n1;

        // Цифра, записанная в выбранном разряде, не меняется, если следующая за ней справа цифра - 0, 1, 2, 3 или 4;
        // Увеличивается на единицу, если следующая за ней справа цифра - 5,6,7,8 или 9.

        if (n2 >= 0.5) {
            n1++;
            System.out.println(n1);
        } else if (n2 > 0 && n2 < 0.5) {
            System.out.println(n1);
        } else {                             // Эту часть условия можно было бы не писать, т.к. мы изначально
            System.out.println(n1);         // просим ввести число с ненулевой дробной частью.
        }
    }
}
