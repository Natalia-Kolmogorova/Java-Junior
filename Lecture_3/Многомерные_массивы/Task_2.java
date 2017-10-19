// Многомерный масссив 5x8

package Многомерные_массивы;


public class Task_2 {
    public static void main(String[] args) {

        int x = -99;
        int y = 99;

        int[][] array = new int[5][8];

        int max = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                int k = (int) (x + (Math.random() * ((y - x) + 1)));
                array[i][j] = k;

                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Значение максимального элемента в массиве: " + max);
    }
}
