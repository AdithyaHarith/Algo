package ds.stack;

import oops.Car;


public class StackCar {



        private Car[] cars;
        private int capacity;
        private int index;

        public StackCar(int capacity) {
            cars = new Car[capacity];
            this.capacity = capacity;
            index = -1;
        }

        public void push(Car car) {
            if ((index + 1) < capacity) {
                index = index + 1;
                cars[index] = car;
            } else System.out.println("stack overflow");
        }

        public Car pop() {
            if (index >= 0) {
                Car car= cars[index];
                index = index - 1;
                return car;

            } else System.out.println("stack is empty");

            return null;
        }



    }






