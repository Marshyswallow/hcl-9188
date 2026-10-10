package MapnSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setimp {
    public static void main(String [] args){

//        order is not preserved and elements are unique
        Set<Integer> st=new HashSet<>();

        st.add(10);
        st.add(10);
        st.add(20);
        st.add(30);
        st.remove(20);
        st.contains(20);

//        oreder is preserved and elements are unique
        Set<Integer> st1=new LinkedHashSet<>();
        st1.add(10);
        st1.add(10);
        st1.add(20);
        st1.add(30);
        st1.remove(20);
        st1.contains(20);

//        order is sorted in TreeSet and elements are unique
        Set<Integer> st2=new TreeSet<>();

        st2.add(10);
        st2.add(10);
        st2.add(20);
        st2.add(30);
        st2.remove(20);
        st2.contains(20);

    }
}
