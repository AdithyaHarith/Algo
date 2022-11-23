package ds.list;


public class ListInt {

    private int[] bero;

    public ListInt(int capacity) {

        bero = new int[capacity];
    }

    public void add(int value, int shelf) { //
        bero[shelf] = value; // inside the bero,there is a shelf in that shelf put in the given values.
    }

    public int get(int shelf) {//
        return bero[shelf]; //  inside the bero ,there have the shelf each shelf have the value and get the value and give the value.
    }

    public int find(int value) {
        for (int i = 0; i <= 4; i++) {
           // int shelf = 0;
            if (bero[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

    /*if (bero[0] == value) {
            return 0;//compare value with first shelf,and return shelf number
        }
        if (bero[1] == value) {
            return 1;
        }
        if (bero[2] == value) {
            return 2;
        }
        if (bero[3] == value) {
            return 3;
        }
        if (bero[4] == value) {
            return 4;
        }
        else {
            return -1;
        }
    }
}*/


