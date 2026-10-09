package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String [] args){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
           list.add(i);
        }

        list.get(4);
        System.out.println(list.contains(4));
        list.set(0,100);
        list.remove(4);
        list.size();
        list.indexOf(100);
        list.add(2);

        list3.addAll(list);
        list.lastIndexOf(2);
        list.isEmpty();
        ArrayList<Integer> list2= (ArrayList<Integer>) list.clone();

    }
}
