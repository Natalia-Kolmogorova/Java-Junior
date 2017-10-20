// Сортировка двумерного массива

package Многомерные_массивы;

public class Task_4 {
    public static void main(String[] args) {

        int x = 0;
        int y = 9;

        int[][] array = new int[6][7];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                int k = (int) (x + (Math.random() * ((y - x) + 1)));
                array[i][j] = k;
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i < 6; i++) {
            sort(array[i]);
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    // Сортировка "пузырьком" по возрастанию
    private static void sort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] < array[k]) {
                    int temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
