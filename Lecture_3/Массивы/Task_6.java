// Является ли массив строго возрастающей последовательностью

package Массивы;


public class Task_6 {
    public static void main(String[] args) {

        int x = 10;
        int y = 99;

        int[] array = new int[4];

        for (int i = 0; i <= 3; i++) {
            array[i] = x + (int)(Math.random() * ((y - x) + 1));
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();


        for (int i=0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                System.out.println("Не строго возрастающая");
                return;
            }
        }

        System.out.println("Строго возрастающая");
    }
}


