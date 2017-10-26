package Accumulator;

public class Multiply extends Operation {

    @Override
    public int doOperation(int x, int y) {
        int multiply = x*y;
        return multiply;
    }
}
