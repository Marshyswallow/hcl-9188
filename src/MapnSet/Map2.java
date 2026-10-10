package MapnSet;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String [] args){
        Map<String,Integer> mp=new HashMap<>();

        mp.put("ram",10);
        mp.put("ankit",30);
        mp.put("alka",40);

        System.out.println("Marks of ram :"+mp.get("ram"));
        mp.forEach((k,v)->System.out.println(k +"marks :"+ v));
    }
}
