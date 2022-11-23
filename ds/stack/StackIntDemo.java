package ds.stack;

public class StackIntDemo {
    public static void main(String[] args) {
        StackInt st = new StackInt(5);
        st.push(3000);
        st.push(2000);
        st.push(1000);
        st.push(5000);
        st.push(6000);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }

}

