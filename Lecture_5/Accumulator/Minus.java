package Accumulator;

public class Minus extends Operation {

    @Override
    public int doOperation(int x, int y) {
        int minus = x-y;
        return minus;
    }
}
