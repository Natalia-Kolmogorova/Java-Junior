// Решение квадратного уравнения

package Условный_оператор;

import java.util.Scanner;

public class Task_3 {
    public static void main (String[] args) {

        System.out.println("Найти корни квадратного уравнения: a*x^2 + b*x + c = 0");
        System.out.println("Введите три вещественных числа: a, b и с");

        Scanner scanner = new Scanner (System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = b*b - 4*a*c;

        if (d>0) {
            double x1 = (- b + Math.sqrt(d))/(2*a);
            double x2 = (- b - Math.sqrt(d))/(2*a);
            System.out.println("У уравнения два корня: " + x1 + " и " + x2);
        } else if (d==0) {
            double x = (- b)/2*a;
            System.out.println("У уравнения один корень: " + x);
        } else if (d<0) {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
