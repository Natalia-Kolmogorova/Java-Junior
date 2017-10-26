package Accumulator;

public class Accumulator {

    private int value = 0;
    private Operation operation;

    public Accumulator(int value, Operation operation) {
        this.value = value;
        this.operation = operation;
    }

    public void accumulate (int x) {
        value = operation.doOperation(value, x);
    }

    public int getValue() {
        return value;
    }
}
