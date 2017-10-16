// Возрастающая последовательность

package Ветвление_в_программе;


import java.util.ArrayList;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        System.out.println("Введите три не равных друг другу числа: ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        while (a == b || a == c || b == c) {
            System.out.println("Числа не должны быть равными между собой. Повторите ввод: ");

            int a1 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int c1 = scanner.nextInt();

            a = a1;
            b = b1;
            c = c1;

        }

        System.out.println("Числа в переменных a, b и c: " + a + ", " + b + ", " + c);

        int min1 = Math.min(a, b);
        int min2 = Math.min(a, c);
        int min3 = Math.min(b, c);
        int min12 = Math.min(min1, min2);
        int theFirstElement = Math.min(min12, min3);

        int max1 = Math.max(a, b);
        int max2 = Math.max(a, c);
        int max3 = Math.max(b, c);
        int max12 = Math.max(max1, max2);
        int theThirdElement = Math.max(max12, max3);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(a);
        newList.add(b);
        newList.add(c);

        newList.remove(new Integer(theFirstElement));
        newList.remove(new Integer(theThirdElement));

        int theSecondElement = newList.get(0);

        System.out.println("Возвращающая последовательность: " + theFirstElement + ", " + theSecondElement + ", " + theThirdElement);

    }
}
