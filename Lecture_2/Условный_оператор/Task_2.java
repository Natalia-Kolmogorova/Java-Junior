// Расстояние до 10

package Условный_оператор;


import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args){

        double x = 10.0;

        System.out.println("Введите два целых числа, не равных друг другу");

        Scanner scanner = new Scanner (System.in);

        double m = scanner.nextDouble();
        double n = scanner.nextDouble();

        double f = Math.abs(m-x);
        double l = Math.abs(n-x);

        if (f==l) {
            System.out.println("Числа находятся на одинаковом расстоянии от 10");
        } else {
            double k = Math.min(f, l);

            if (k == f) {
                System.out.println(m + " ближе к 10");
            } else if (k == l) {
                System.out.println(n + " ближе к 10");
            }
        }
    }
}
