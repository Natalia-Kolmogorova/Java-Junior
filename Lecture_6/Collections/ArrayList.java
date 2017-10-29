package Collections;

import java.util.Arrays;

public class ArrayList implements List, Stack, Queue {

    Object[] array = new Object[5];
    private int i = 0; // Порядковый номер элемента в исходном массиве, размер массива

    @Override
    public void add(Object x) {
        array[i] = x;
        i++;

        if (i == array.length) {
            array = Arrays.copyOf(array, array.length+5);
        }
    }

    @Override
    public Object poll() {
        return remove(0);
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object remove(int index) {
        Object deletedElement = array[index];
        array[index] = null;
        i--;

        for (int i = index+1; i < array.length; i++) {
            array[index] = array[i];
            index++;
        }

        return deletedElement;
    }

    @Override
    public int size() {
        return i;
    }

    @Override
    public void push(Object x) {
        add(x);
    }

    @Override
    public Object pop() {
        Object x = remove(i-1); // Т.к. нумерация элементов начинается с нуля!
        return x;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
