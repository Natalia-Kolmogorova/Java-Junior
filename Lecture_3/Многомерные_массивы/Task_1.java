// Многомерный масссив 8x5

package Многомерные_массивы;


public class Task_1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 99;

        int[][] array = new int[8][5];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                int k = (int) (x + (Math.random() * ((y - x) + 1)));
                array[i][j] = k;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
