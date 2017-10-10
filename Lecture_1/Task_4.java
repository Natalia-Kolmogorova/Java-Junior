// Сумма цифр трехзначного числа

import java.util.Scanner;

public class Task_4 {

    public static void main (String[] args) {

        System.out.println("Введите натуральное трехзначное число");

        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();

        String s = String.valueOf(n);

        char[] chArray = s.toCharArray();
        char x = chArray[0];
        char y = chArray[1];
        char z = chArray[2];

        int x1 = Character.digit (x, 10);
        int y1 = Character.digit (y, 10);
        int z1 = Character.digit (z, 10);

        System.out.println(x1+y1+z1);
    }
}
