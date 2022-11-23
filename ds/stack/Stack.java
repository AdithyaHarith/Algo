package ds.stack;

public class Stack {
    private String[] bag;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        bag = new String[capacity];
        this.capacity = capacity;
        index = -1;
    }

    public void push(String name) {
        if ((index + 1) < capacity) {
            index = index + 1;
            bag[index] = name;
        } else System.out.println("stack overflow");
    }

    public String pop() {
        if (index >= 0) {
            String name = bag[index];
            index = index - 1;
            return name;

        } else System.out.println("stack is empty");

        return null;
    }
}
