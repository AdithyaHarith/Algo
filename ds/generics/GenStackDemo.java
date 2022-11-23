package ds.generics;

import ds.stack.Stack;
import ds.stack.StackCar;
import ds.stack.StackDog;
import ds.stack.StackInt;
import oops.Car;
import oops.Dog;

public class GenStackDemo {
    public static void main(String[] args) {
        GenStack<String> stk = new GenStack<>(5);
        stk.push("chennai");
        stk.push("salem");
        stk.push("madurai");
        stk.push("trichy");
        stk.push("abc");

        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());

        GenStack<Integer> st = new GenStack<>(5);
        st.push(3000);
        st.push(2000);
        st.push(1000);
        st.push(5000);
        st.push(6000);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        GenStack<Car> s = new GenStack<>(5);

        Car car = new Car("Hyundai i10");
        Car car1 = new Car ("Maruti Swift" );
        Car car2 = new Car("Maruti Wagon");
        Car car3 = new Car ("Hyundai Creta");
        Car car4= new Car("Honda City");

        s.push(car);
        s.push(car1);
        s.push(car2);
        s.push(car3);
        s.push(car4);

        System.out.println(s.pop().getName());
        System.out.println(s.pop().getName());
        System.out.println(s.pop().getName());
        System.out.println(s.pop().getName());
        System.out.println(s.pop().getName());

        GenStack<Dog> stack = new GenStack<>(5);

        Dog dog=new Dog("Shri",7);
        Dog dog1=new Dog("abc",6);
        Dog dog2=new Dog("sfty",8);
        Dog dog3=new Dog("xyz",9);
        Dog dog4=new Dog("Shiroo",4);

        stack.push(dog);
        stack.push(dog1);
        stack.push(dog2);
        stack.push(dog3);
        stack.push(dog4);


    }

}




