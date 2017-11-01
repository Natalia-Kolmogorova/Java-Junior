package Collections;

public class LinkedList implements List, Stack, Queue {

    Node node = null; // Список пуст.

    @Override
    public void add(Object x) {
        if (node == null) {
            node = new Node(x);
        } else {
            Node currentNode = node;
            while (true) {
                if (currentNode.nextNode == null) {
                    currentNode.nextNode = new Node(x);
                    break;
                } else {
                    currentNode = currentNode.nextNode;
                }
            }
        }
    }

    @Override
    public Object poll() {
        return remove(0);
    }

    @Override
    public Object get(int index) {
        Node n = getNodeByIndex(index);
        return n.value;
    }

    @Override
    public Object remove(int index) {

        Node removedNode = getNodeByIndex(index);

        if (index == 0) {
            if (node.nextNode != null) {
                node = node.nextNode;
            } else {
                node = null;
            }
        } else {
            Node previousNode = getNodeByIndex(index - 1);
            Node nextNode = getNodeByIndex(index + 1);
            previousNode.nextNode = nextNode;
        }

        return removedNode;
    }

    @Override
    public int size() {
        if (node == null) {
            return 0;
        } else {
            Node currentNode = node;
            for (int i = 0; ; i++) {
                if (currentNode == null) {
                    return i;
                }
                currentNode = currentNode.nextNode;
            }
        }
    }

    @Override
    public void push(Object x) {
        add(x);
    }

    @Override
    public Object pop() {
        Object x = remove(size() - 1);
        return x;
    }

    @Override
    public String toString() {
        String result = "";
        Node currentNode = node;
        while (true) {

            if (currentNode == null) {
                return result;
            }

            result += currentNode.value + " ";
            currentNode = currentNode.nextNode;
        }
    }

    private Node getNodeByIndex(int index) {
        if (index == 0) {
            return node;
        } else {
            Node currentNode = node;
            for (int i = 0; ; i++) {
                if (i == index) {
                    return currentNode;
                }

                if (currentNode == null) {
                    throw new IndexOutOfBoundsException();
                }

                currentNode = currentNode.nextNode;
            }
        }
    }
}
