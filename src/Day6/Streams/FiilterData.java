package Day6.Streams;

import java.util.ArrayList;
import java.util.List;

public class FiilterData {
    public static void main(String [] args){
        List<Integer> list=new ArrayList<>();

        for(int i=1;i<6;i++){
            list.add(i);
        }

        list.stream().filter(num->num%2==0).map(num->num*num).forEach(n->System.out.println(n));
        long c1=list.stream().filter(num->num%2!=0).count();
        System.out.println(c1);

    }
}
