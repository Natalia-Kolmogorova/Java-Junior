// Число в интервале

package Ветвление_в_программе;


public class Task_1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 155;

        double x = Math.random() * b;
        double generatedNumberD = a + x;
        int generatedNumberI = (int) generatedNumberD;

        if (generatedNumberI > 25 && generatedNumberI < 100) {
            System.out.println("Число " + generatedNumberI + " содержится в интервале (25,100)");
        } else {
            System.out.println("Число " + generatedNumberI + " не содержится в интервале (25,100)");
        }

    }
}
