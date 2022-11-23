package ds.list;

import oops.Car;

public class CarListDemo {
    public static void main(String[] args) {
        CarList cl=new CarList(5);

        Car car = new Car("Hyundai i10");
        Car car1 = new Car ("Maruti Swift" );
        Car car2 = new Car("Maruti Wagon");
        Car car3 = new Car ("Hyundai Creta");
        Car car4= new Car("Honda City");

        cl.add(car,0);
        cl.add(car1,1);
        cl.add(car2,2);
        cl.add(car3,3);
        cl.add(car4,4);

        System.out.println(cl.get(0).getName());
        System.out.println(cl.get(1).getName());
        System.out.println(cl.get(2).getName());
        System.out.println(cl.get(3).getName());
        System.out.println(cl.get(4).getName());

        int cr=cl.find("Hyundai i10");
        System.out.println(cr);

        int cr1=cl.find("abc");
        System.out.println(cr1);
    }
}
