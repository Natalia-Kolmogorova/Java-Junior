// Счастливый билетик

package Циклы;


public class Task_10 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i<=999999; i++) {
            int number1 = i % 10;
            int number2 = (i /10) % 10;
            int number3 = (i /100) % 10;
            int number4 = (i /1000) % 10;
            int number5 = (i /10000) % 10;
            int number6 = (i /100000) % 10;

            if ((number1+number2+number3) == (number4+number5+number6)) {
                count++;
            }
        }
        System.out.println("Количество счастливых билетов: " + count);
    }
}
