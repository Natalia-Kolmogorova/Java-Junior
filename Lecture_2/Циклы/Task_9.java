// Сумма всех цифр введенного числа

package Циклы;


import java.util.Scanner;

public class Task_9 {
    public static void main (String[] args) {

        System.out.println("Введите число: ");

        Scanner scanner = new Scanner (System.in);
        int inputNumber = scanner.nextInt();

        int sum = 0;
        while(inputNumber != 0){
            sum = sum + (inputNumber % 10);
            inputNumber/=10;
        }

        System.out.println(sum);
    }
}
