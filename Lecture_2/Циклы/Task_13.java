// You in the army now

package Циклы;


public class Task_13 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i<=99999; i++) {
            String value = String.valueOf(i);

            if (value.contains("13") || value.contains("4")) {
                count++;
            }
        }
        System.out.println("Придется исключить " + count + " единиц техники");


    }
}
