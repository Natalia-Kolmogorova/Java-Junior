// Массив из нечетных чисел

package Массивы;


public class Task_2 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 99; i++) {

            if (i % 2 != 0) {
                count++;
            }
        }

        int[] array = new int[count];

        int n = 1;
        for (int i = 0; i < count; i++) {
            array[i] = n;
            n += 2;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = (count - 1) ; i>=0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
