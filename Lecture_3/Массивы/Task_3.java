// 15 случайных целых чисел

package Массивы;

public class Task_3 {
    public static void main(String[] args) {

        int x = 0;
        int y = 9;

        int[] array = new int[15];

        for (int i=0; i < 15; i++) {
            array[i] = (int) (x + (Math.random() * y));
        }

        int count = 0;
        for (int i : array) {
            System.out.print(i + " ");

            if (i % 2 == 0 && i>0) {
                count++;
            }
        }

        System.out.println("\nВ массиве " + count + " четных элементов");
    }
}
