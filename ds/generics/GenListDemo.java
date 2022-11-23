package ds.generics;

import ds.list.*;
import oops.Car;
import oops.Dog;
import ds.list.ListInt;


public class GenListDemo {
    public static void main(String[] args) {
        GenList<Dog> dl = new GenList<>(5);



        Dog dog = new Dog("Shri", 7);
        Dog dog1 = new Dog("anc", 4);
        Dog dog2 = new Dog("abc", 7);
        Dog dog3 = new Dog("xyz", 7);
        Dog dog4 = new Dog("aaa", 7);

        dl.add(dog,0);
        dl.add(dog1, 1);
        dl.add(dog2, 2);
        dl.add(dog3,3);
        dl.add(dog4, 4);


        System.out.println(dl.get(0).getName());
        System.out.println(dl.get(1).getName());
        System.out.println(dl.get(2).getName());
        System.out.println(dl.get(3).getName());
        System.out.println(dl.get(4).getName());

//        int dl1 = dl.find("Shri");
//        System.out.println(dl1);
//
//        int dl2=dl.find("ccc");
//        System.out.println(dl2);

        GenList<Car> cl=new GenList<>(5);

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

        GenList<Integer> l = new GenList<Integer>(5);
        int a=0;

        l.add(10,3);



        l.add(20, 0);
        l.add(50, 1);
        l.add(60,2);
        l.add(70, 4);

        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        System.out.println(l.get(3));
        System.out.println(l.get(4));

        GenList<String> l1 = new GenList<>(5);
        l1.add("abc", 0);
        l1.add("aaa", 3);
        l1.add("xyz", 2);
        l1.add("bbb", 4);
        l1.add("ccc", 1);

        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));
        System.out.println(l1.get(3));
        System.out.println(l1.get(4));

    }
}

