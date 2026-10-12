package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparison {
    public static void main(String[] args){
        ArrayList<Faculty> employee= new ArrayList<>();

        employee.add(new Faculty("Vishal",4,2000));
        employee.add(new Faculty("Satyam",2,5000));
        employee.add(new Faculty("Ankit",1,6000));
        employee.add(new Faculty("Shivansh",6,8000));
        employee.add(new Faculty("Krishna",5,4000));


        class comp implements Comparator<Faculty>{
            @Override
            public int compare(Faculty f1, Faculty f2) {
                return Integer.compare(f1.id,f2.id);
            }
        }

        Collections.sort(employee,new comp());

        System.out.println(employee.toString());
    }
}

class Faculty{
    int id;
    String name;
    int salary;

    public Faculty( String name,  int id,  int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee: "+id + " "+name+" "+salary;
    }
}
