package ds.predefined;

import oops.Car;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(12);
        list.add(2,23);

        System.out.println(list.get(0));

        List<Car> carlist=new ArrayList<>();

        Car c1=new Car("abc");
        Car c2=new Car("xyz");

        carlist.add(c1);
        carlist.add(c2);

        System.out.println(carlist.get(1).getName());


    }
}
