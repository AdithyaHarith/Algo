package ds.list;

public class ListIntDemo {
    public static void main(String[] args) {
        ListInt l = new ListInt(5);
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

        a = l.find(60);
        System.out.println(a);

        a = l.find(100);
        System.out.println(a);


    }
}
