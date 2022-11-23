package ds.generics;

import oops.Dog;

public class GenList<T> {
    private T[] dogs;

    public GenList(int capacity) {
      //  E[] arr = (E[])new Object[INITIAL_ARRAY_LENGTH];

        dogs = (T[]) new Object[capacity];
    }

    public void add(T dog, int shelf) {//inside the dogs,put in the dog in to the dogs.

        dogs[shelf] = dog;
    }

    public T get(int shelf) {//inside the dogs,get in to the dog from the dogs.
        return dogs[shelf];

    }

//    public int find(String name) {
//        for (int i = 0; i <= 4; i++) {
//            if (dogs[i].getName().equals(name)) {
//                return i;
//            }
//        }
//        return -1;
//
//    }

}
