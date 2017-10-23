package Adder;

public class Adder {
    int value;
    int step;

    Adder (int step) {
        this.step = step;
    }

    public int getValue() {
        return value;
    }

    public void add() {
        value += step;
    }

}
