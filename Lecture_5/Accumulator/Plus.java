package Accumulator;

public class Plus extends Operation {

    @Override
    public int doOperation(int x, int y) {
        int plus = x+y;
        return plus;
    }
}
