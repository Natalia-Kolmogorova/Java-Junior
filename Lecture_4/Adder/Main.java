package Adder;

public class Main {
    public static void main(String[] args) {

        Adder adder = new Adder(10);

        System.out.println(adder.getValue());

        adder.add();

        System.out.println(adder.getValue());

    }
}
