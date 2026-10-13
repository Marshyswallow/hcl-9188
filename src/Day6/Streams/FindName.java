package Day6.Streams;

import java.util.*;
public class FindName {
    public static void main(String[] args){
        List<String> list=List.of("vishal","satyam","ankit","ayush","gamer");

        list.stream().filter(name->name.startsWith("s") || name.startsWith("t")).map(n->"mr "+n).forEach(n->System.out.println(n));
    }
}
