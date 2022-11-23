package oops;

public class Dog {
    private String name;
    private int age;


    // setters and getters
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }


    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }


    public void bark() {
        System.out.println(name + "is barking");
    }

    public void run() {
        System.out.println(name + "is running");
    }
}
