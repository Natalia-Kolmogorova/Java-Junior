// Таблица умножения для учеников

package Многомерные_массивы;

public class Task_5 {
    public static void main(String[] args) {

        int[][] array = new int[15][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (2 + (Math.random() * ((9 - 2) + 1)));


                if (j == array[i].length - 1) {
                    array[i][j] = array[i][j - 2] * array[i][j - 1];


                    for (int q = 0; q < i; q++) {
                        if (array[i][j] == array[q][j] && i > 0) {
                            if (array[i][j - 1] == array[q][j - 1] || array[i][j - 2] == array[q][j - 2]) {
                                --i;
                            }
                        }
                    }
                }
            }
        }

        // Вывод на экран
        for (int i = 0; i < array.length; i++) {
            System.out.print("Задание #" + (i + 1) + ": ");
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    System.out.print(array[i][j] + " * ");
                }
                if (j == 1) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}
