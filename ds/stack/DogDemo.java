package ds.stack;
import oops.Dog;

public class DogDemo {

        public static void main(String[] args) {
            StackDog stack = new StackDog(5);

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

            System.out.println(stack.pop().getName());
            System.out.println(stack.pop().getName());
            System.out.println(stack.pop().getName());
            System.out.println(stack.pop().getName());
            System.out.println(stack.pop().getName());

        }
    }


