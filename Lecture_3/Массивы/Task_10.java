// Элемент, чаще всего встречающийся в массиве

package Массивы;


public class Task_10 {
    public static void main(String[] args) {

        int x = -1;
        int y = 1;

        int[] array = new int[11];

        for (int i = 0; i <= 10; i++) {
            array[i] = (int) (x + (Math.random() * ((y - x) + 1)));
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        int plus = 0;
        int minus = 0;
        int zero = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                plus++;
            } else if (array[i] < 0) {
                minus++;
            } else {
                zero++;
            }
        }

        System.out.println();

        if (plus > minus && plus > zero) {
            System.out.println("В массиве больше всего элементов со значением 1. Это значение встречается " + plus + " раз.");
        } else if (minus > plus && minus > zero) {
            System.out.println("В массиве больше всего элементов со значением -1. Это значение встречается " + minus + " раз.");
        } else if (zero > plus && zero > minus) {
            System.out.println("В массиве больше всего элементов со значением 0. Это значение встречается " + zero + " раз.");
        }

    }
}
