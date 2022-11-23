package oops;

public class Car {

    String name;
   // String brand;

    public Car(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void drive() {
        System.out.println(name+ " is driving");
    }

    public void brake(int v) {
        System.out.println(name + " is applied");
    }

    public void brake(String v) {
        System.out.println(name + " is applied");
    }

    public void reverse() {
        System.out.println("car is reversing");

    }

}
