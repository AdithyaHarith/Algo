package ds.list;

import oops.Car;

public class CarList {
    private Car[] cars;

    public CarList(int capacity) {

        cars = new Car[capacity];
    }




    public void add(Car car, int shelf) {
        cars[shelf] = car;
    }

    public Car get(int shelf) {
        return cars[shelf];
    }

    public int find(String name) {
        for (int i = 0; i <= 4; i++) {
            if (cars[i].getName().equals(name)) {
                return i;
            }

        }
        return -1;
    }
}
