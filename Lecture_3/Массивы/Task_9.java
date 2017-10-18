// Отношение элементов

package Массивы;

public class Task_9 {
    public static void main(String[] args) {

        // Создаем 1-й массив

        int x1 = 1;
        int y1 = 9;

        int[] array1 = new int[10];

        for (int i = 0; i < 10; i++) {
            array1[i] = x1 + (int)(Math.random() * ((y1 - x1) + 1));
        }

        // Создаем 2-й массив

        int[] array2 = new int[10];

        for (int i = 0; i < 10; i++) {
            array2[i] = x1 + (int)(Math.random() * ((y1 - x1) + 1));
        }

        // Создаем 3-й массив

        double[] array3 = new double[10];


        int count = 0;
        for (int i = 0; i < 10; i++) {
            array3[i] = (double) array1[i]/ array2[i];

            if (array1[i] % array2[i] == 0) {
                count++;
            }
        }

        // Выводим массивы на экран

        for (int i : array1) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : array2) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (double i : array3) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Количество целых чисел в третьем массиве: " + count);

    }
}
