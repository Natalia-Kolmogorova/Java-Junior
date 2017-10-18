// Среднее арифметическое в массивах

package Массивы;


public class Task_5 {
    public static void main(String[] args) {

        int x = 0;
        int y = 5;

        // Операции с первым массивом

        int[] array1 = new int[5];

        for (int i = 0; i <= 4; i++) {
            array1[i] = (int) (x + (Math.random() * y));
        }

        for (int i : array1) {
            System.out.print(i + " ");
        }

        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }

        System.out.println();

        double average1 = sum1 / array1.length;  // Среднее арифметическое для первого массива


        // Операции со вторым массивом

        int[] array2 = new int[5];

        for (int i = 0; i <= 4; i++) {
            array2[i] = (int) (x + (Math.random() * y));
        }

        for (int i : array2) {
            System.out.print(i + " ");
        }

        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }

        double average2 = sum2 / array2.length;  // Среднее арифметическое для второго массива

        System.out.println();

        if (average1 > average2) {
            System.out.println("Среднее арифметическое для 1-го массива БОЛЬШЕ");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое для 2-го массива БОЛЬШЕ");
        } else {
            System.out.println("Среднее арифметическое для обоих массивов ОДИНАКОВО");
        }

    }
}
