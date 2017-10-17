// 11 членов последовательности Фибоначчи

package Циклы;


public class Task_8 {
    public static void main(String[] args) {

        int first = 1;
        int second = 1;

        System.out.println(first);
        System.out.println(second);

        for (int i = 0; i < 9; i++) {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
