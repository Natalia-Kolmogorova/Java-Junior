// Массив из первых 20-ти чисел Фибоначчи

package Массивы;


public class Task_7 {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        int[] array = new int[20];
        array[0] = x;
        array[1] = y;

        for (int i = 2; i < 20; i++) {
            array[i] = x+y;
            x = array[i-1];
            y = array [i];
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
