// Полки и таблички

package Циклы;


import java.util.ArrayList;

public class Task_11 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 50000; i++) {

            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(i % 10);
            arrayList.add((i / 10) % 10);
            arrayList.add((i / 100) % 10);
            arrayList.add((i / 1000) % 10);
            arrayList.add((i / 10000) % 10);

            if (arrayList.contains(2)) {
                count++;
            }
        }
        System.out.println("Количество ошибочных табличек: " + count);
    }
}
