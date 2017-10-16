// Четность/нечетность числа

package Условный_оператор;


import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Введенное число является нулем");
        } else if (n % 2 == 0) {
            System.out.println("Введенное число является четным");
        } else if (n % 2 != 0) {
            System.out.println("Введенное число является нечетным");
        }
    }
}
