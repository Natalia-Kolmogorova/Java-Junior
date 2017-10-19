// Случайные числа из [0; n]

package Массивы;


import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

        System.out.println("Введите натуральное число больше 3: ");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n % 2 != 0 && n < 3) {
            System.out.println("Необходимо ввести НАТУРАЛЬНОЕ число, превышающее 3. Попробуйте снова: ");

            int y = scanner.nextInt();
            n = y;
        }

        int[] array = new int[n];

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = k + (int) (Math.random() * ((n - k) + 1));
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        int count = 0;
        for (int i : array) {
            if (i % 2 == 0 && i != 0) {
                count++;
            }
        }

        int[] array2 = new int[count];


        int p = 0;
        for (int m : array) {
            if (m % 2 == 0 && m != 0) {
                array2[p] = m;
                p++;
            }
        }


        for (int i : array2) {
            System.out.print(i + " ");
        }

    }
}
