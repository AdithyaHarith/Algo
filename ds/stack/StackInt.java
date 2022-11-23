package ds.stack;

public class StackInt {

    private int[] salary;
    private int capacity;
    private int number;
    private int index;

    public StackInt(int capacity) {
        salary = new int[capacity];
        this.capacity = capacity;
        index = -1;
    }
    public void push(int number) {

        if ((index + 1) < capacity) {
            index = index + 1;
            salary[index] = number;
        } else System.out.println("stack overflow");

    }

    public int pop() {

        if (index >= 0) { // pop till index reaches 0
            int n = salary[index];
            index = index - 1;
            return n;
        } else System.out.println("stack is empty");
        return 0;
    }
}
