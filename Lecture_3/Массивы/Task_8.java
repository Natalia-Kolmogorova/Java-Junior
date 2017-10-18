// Максимальный объект в массиве

package Массивы;


public class Task_8 {
    public static void main(String[] args) {

        int x = -15;
        int y = 15;

        int[] array = new int[12];

        for (int i = 0; i <= 11; i++) {
            array[i] = x + (int)(Math.random() * ((y - x) + 1));
        }


        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }

        System.out.println("Максимальное значение элемента: " + max);
        System.out.println("Индекс последнего вхождения максимального элемента: " + index);

    }
}
