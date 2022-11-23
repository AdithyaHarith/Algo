package ds.stack;

import oops.Car;


public class CarDemo {

    public static void main(String[] args) {
        StackCar s = new StackCar(5);

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

    }
}







