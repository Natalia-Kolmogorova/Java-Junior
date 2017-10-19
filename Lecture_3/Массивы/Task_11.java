// Четное положительное число

package Массивы;


import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        System.out.println("Введите четное положительное число: ");

        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        while (inputNumber % 2 != 0 || inputNumber <= 0) {
            System.out.println("Некорректный ввод числа. Введите ЧЕТНОЕ ПОЛОЖИТЕЛЬНОЕ число: ");

            int newNumber = scanner.nextInt();
            inputNumber = newNumber;
        }

        int[] array = new int[inputNumber];


        int x = -5;
        int y = 5;
        for (int i = 0; i < array.length; i++) {
            array[i] = x + (int)(Math.random() * ((y - x) + 1));
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        int sumSum1 = 0;
        int sumSum2 = 0;
        for (int i = 0; i < array.length; i++) {

            if (i < (array.length/2)) {
                int sum1 = Math.abs(array[i]);
                sumSum1 += sum1;
            } else if (i >= (array.length/2)) {
                int sum2 = Math.abs(array[i]);
                sumSum2 += sum2;
            }
        }

        if (sumSum1 > sumSum2) {
            System.out.println("Сумма модулей первой половины массива БОЛЬШЕ, чем сумма модулей второй половины");
        } else if (sumSum1 < sumSum2) {
            System.out.println("Сумма модулей первой половины массива МЕНЬШЕ, чем сумма модулей второй половины");
        } else {
            System.out.println("Сумма модулей первой половины массива РАВНА сумме модулей второй половины");
        }
    }
}
