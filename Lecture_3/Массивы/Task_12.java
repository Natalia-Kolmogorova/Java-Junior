// Равное количество положительных и отрицательных элементов

package Массивы;


public class Task_12 {
    public static void main(String[] args) {

        int x = -10;
        int y = 10;

        int[] array = new int[12];

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < array.length; i++) {
            while (true) {
                int number = x + (int) (Math.random() * ((y - x) + 1));
                if (number != 0) {

                    if (number > 0 && positive < 6) {
                        positive++;
                    } else if (number < 0 && negative < 6) {
                        negative++;
                    } else {
                        continue;
                    }

                    array[i] =  number;
                    break;
                }
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
