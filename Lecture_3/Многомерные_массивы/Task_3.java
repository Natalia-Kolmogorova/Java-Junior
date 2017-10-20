// Индекс строки с наибольшим по модулю произведением элементов

package Многомерные_массивы;


public class Task_3 {
    public static void main(String[] args) {

        int x = -5;
        int y = 5;

        int[][] array = new int[7][4];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                int k = (int) (x + (Math.random() * ((y - x) + 1)));
                array[i][j] = k;
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[] array2 = new int[7];

        for (int i = 0; i < 7; i++) {
            int number = 1;
            for (int j = 0; j < 4; j++) {
                int z = Math.abs(array[i][j]);
                number *= z;
            }
            array2[i] = number;
        }

        System.out.println();

        for (int i : array2) {
            System.out.println(i);
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < 7; i++) {
            if (array2[i] > max) {
                max = array2[i];
                index = i;
            }
        }

        System.out.println();
        System.out.println("Индекс строки с наибольшим по модулю произведением элементов: " + index);

    }
}
