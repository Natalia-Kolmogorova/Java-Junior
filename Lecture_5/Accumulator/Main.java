package Accumulator;

public class Main {
    public static void main(String[] args) {

        Operation operationPow = new Power();
        Accumulator accumulatorPower = new Accumulator(5, operationPow);
        accumulatorPower.accumulate(2);
        int value1 = accumulatorPower.getValue();
        System.out.println(value1);

        Operation operationMultiply = new Multiply();
        Accumulator accumulatorMultiply = new Accumulator(2, operationMultiply);
        accumulatorMultiply.accumulate(2);
        int value2 = accumulatorMultiply.getValue();
        System.out.println(value2);

        Operation operationPlus = new Plus();
        Accumulator accumulatorPlus = new Accumulator(3, operationPlus);
        accumulatorPlus.accumulate(2);
        int value3 = accumulatorPlus.getValue();
        System.out.println(value3);

        Operation operationMinus = new Minus();
        Accumulator accumulatorMinus = new Accumulator(8, operationMinus);
        accumulatorMinus.accumulate(2);
        int value4 = accumulatorMinus.getValue();
        System.out.println(value4);

        Operation operationDivide = new Divide();
        Accumulator accumulatorDivide = new Accumulator(16, operationDivide);
        accumulatorDivide.accumulate(2);
        int value5 = accumulatorDivide.getValue();
        System.out.println(value5);
    }
}
