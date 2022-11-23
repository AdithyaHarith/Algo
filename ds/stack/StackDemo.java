package ds.stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        stk.push("chennai");
        stk.push("salem");
        stk.push("madurai");
        stk.push("trichy");
        stk.push("abc");

        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
}
