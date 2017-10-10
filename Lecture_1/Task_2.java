// Сумма цифр двухзначного числа

import java.util.Scanner;

public class Task_2 {

    public static void main (String[] args) {

        System.out.println("Введите натуральное двузначное число");

        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();

        String s = String.valueOf(n);

        char[] chArray = s.toCharArray();
        char x = chArray[0];
        char y = chArray[1];

        int x1 = Character.digit (x, 10);
        int y1 = Character.digit (y, 10);

        System.out.println(x1+y1);
    }
}
