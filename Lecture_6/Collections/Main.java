package Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        processStack(list);

    }

    private static void processStack(Stack stack) {
        stack.push(1);
        stack.pop();
    }

}
