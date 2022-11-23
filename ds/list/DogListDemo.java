package ds.list;

import oops.Dog;

public class DogListDemo {
    public static void main(String[] args) {
        DogList dl = new DogList(5);



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

        int dl1 = dl.find("Shri");
        System.out.println(dl1);

        int dl2=dl.find("ccc");
        System.out.println(dl2);


    }
}

