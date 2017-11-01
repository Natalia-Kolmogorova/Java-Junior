package Collections;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(8);
        linkedList.add(8);

        linkedList.push(22);
        linkedList.push(33);

        linkedList.pop();

        linkedList.poll();

        System.out.println(linkedList);
    }
}
