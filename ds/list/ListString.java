package ds.list;

public class ListString {
    private String[] bero;

    public ListString(int capacity) {
        bero = new String[capacity];

    }

    public void add(String name, int shelf) {
        bero[shelf] = name;
    }

    public String get(int shelf) {
        return bero[shelf];


    }
    public int find(String name){
        for (int i = 0; i <= 4; i++) {
            // int shelf = 0;
            if (bero[i].equals(name))  {
                return i;
            }
        }
        return -1;
    }
}


