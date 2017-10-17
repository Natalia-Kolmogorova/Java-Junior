// Электронные часы

package Циклы;


public class Task_12 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i<24; i++) {
            int numberRight = i % 10;
            int numberLeft = (i /10) % 10;

            int x = (numberRight*10)+numberLeft;

            if (x<60){
                count++;
            }
        }
        System.out.println(count);
    }
}
