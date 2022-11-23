package ds.list;

import oops.Dog;

public class DogList {
    private Dog[] dogs;


    public DogList(int capacity) {
        dogs = new Dog[capacity];


    }

    public void add(Dog dog, int shelf) {//inside the dogs,put in the dog in to the dogs.

        dogs[shelf] = dog;
    }

    public Dog get(int shelf) {//inside the dogs,get in to the dog from the dogs.
        return dogs[shelf];

    }

    public int find(String name) {
        for (int i = 0; i <= 4; i++) {
            if (dogs[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;

    }

}

