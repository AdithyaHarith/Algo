package ds.generics;

public class GenStack<T> {
    private T[] bag;
    private int capacity;
    private int index;

    public GenStack(int capacity) {
      //  dogs = (T[]) new Object[capacity];
        bag = (T[]) new Object[capacity];
        this.capacity = capacity;
        index = -1;
    }

    public void push(T name) {
        if ((index + 1) < capacity) {
            index = index + 1;
            bag[index] = name;
        } else System.out.println("stack overflow");
    }

    public T pop() {
        if (index >= 0) {
            T name = bag[index];
            index = index - 1;
            return name;

        } else System.out.println("stack is empty");

        return null;
    }
}

