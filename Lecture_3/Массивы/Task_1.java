// Массив из четных чисел от 2 до 20

package Массивы;


public class Task_1 {
    public static void main(String[] args) {

        int[] array = new int[10];

        int n = 2;
        for (int i = 0; i<10; i++) {
            array[i] = n;
            n += 2;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : array) {
            System.out.println(i);
        }
    }

}
