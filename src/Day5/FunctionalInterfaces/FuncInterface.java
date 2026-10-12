package Day5.FunctionalInterfaces;

import java.util.function.Predicate;

public class FuncInterface {
    public static void main(String[] args){
        Predicate<Integer> even = n->n%2==0;
        System.out.println(even.test(10));


    }
}
