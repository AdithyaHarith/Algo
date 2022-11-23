package ds.list;

public class ListStringDemo {
    public static void main(String[] args) {
        ListString l1 = new ListString(5);
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

        int l=l1.find("aaa");
        System.out.println(l);

        int lt=l1.find("ddd");
        System.out.println(lt);


    }

}
