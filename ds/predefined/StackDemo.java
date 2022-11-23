package ds.predefined;

import oops.Dog;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>(); // LIFO
        stack.push(12);
        stack.push(10);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Stack<String> stack1=new Stack<>();
        stack1.push("chennai");
        stack1.push("trichy");

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        Stack<Dog> dogStack= new Stack<>();
        Dog dog=new Dog("abc",12);
        Dog dog1=new Dog("xyz",10);
        Dog dog2=new Dog("Staffy",21);

        dogStack.push(dog);
        dogStack.push(dog1);
        dogStack.push(dog2);

        System.out.println(dogStack.pop().getAge());
        System.out.println(dogStack.pop().getName());
        System.out.println(dogStack.pop().getName());


    }
}
