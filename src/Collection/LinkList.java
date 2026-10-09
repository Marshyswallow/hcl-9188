package Collection;

import java.util.*;
import java.util.List;

public class LinkList {
    public static void main(String[] args){
        LinkedList<String> ll=new LinkedList<>();

        ll.add("Apple");
        ll.add("Banana");
        ll.add("Mango");
        ll.add("Guava");
        ll.add("Watermelon");
        ll.add("Pineapple");
        ll.add("Orange");

        int idx=ll.indexOf("Watermelon");

        ll.add(idx+1,"grapes");

        System.out.println(ll.toString());
    }
}
