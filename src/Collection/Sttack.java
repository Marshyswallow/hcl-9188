package Collection;

import java.util.*;
public class Sttack {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(50);


        st.pop();
        System.out.println(st.peek());
        System.out.println(st.search(30));
    }
}
