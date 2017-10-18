// Нечетные индексы - в ноль

package Массивы;


public class Task_4 {

    public static void main(String[] args) {

        int x = 1;
        int y = 10;

        int[] array = new int[8];

        for (int i = 0; i <= 7; i++) {
            array[i] = (int) (x + (Math.random() * y));
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i <= 7; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
