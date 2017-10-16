// Наибольшая цифра в трехзначном числе

package Ветвление_в_программе;


public class Task_2 {
    public static void main (String[] args) {

        int a = 100;
        int b = 999;

        double x = Math.random() * b;
        double generatedNumberD = a + x;
        int generatedNumberI = (int) generatedNumberD;

        String string = String.valueOf(generatedNumberI);

        char[] chArray = string.toCharArray();
        char k = chArray[0];
        char l = chArray[1];
        char m = chArray[2];

        int k1 = Character.digit (k, 10);
        int l1 = Character.digit (l, 10);
        int m1 = Character.digit (m, 10);

        if (k1 > l1 && k1 > m1) {
            System.out.println("В числе " + generatedNumberI + " наибольшая цифра " + k1);
        } else if (l1 > k1 && l1 > m1) {
            System.out.println("В числе " + generatedNumberI + " наибольшая цифра " + l1);
        } else if (m1 > k1 && m1 > l1) {
            System.out.println("В числе " + generatedNumberI + " наибольшая цифра " + m1);
        }

    }
}
