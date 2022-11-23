package ds.stack;

import oops.Dog;

public class StackDog {
    private Dog[] dogs;
    private int capacity;
    private int index;

    public StackDog(int capacity) {
        dogs = new Dog[capacity];
        this.capacity = capacity;
        index = -1;
    }

    public void push(Dog dog) {
        if ((index + 1) < capacity) {
            index = index + 1;
            dogs[index] = dog;
        } else System.out.println("stack overflow");
    }

    public Dog pop() {
        if (index >= 0) {
            Dog dog = dogs[index];
            index = index - 1;
            return dog;

        } else System.out.println("stack is empty");

        return null;
    }



}




