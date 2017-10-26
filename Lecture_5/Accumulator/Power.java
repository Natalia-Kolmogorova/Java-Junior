package Accumulator;

public class Power extends Operation {

    @Override
    public int doOperation(int x, int y) {
        int power =  (int) Math.pow(x, y);
        return power;
    }
}
