package MapnSet;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int marks;
    String name;
    int age;

    Student(int marks,String name,int age){
        this.marks=marks;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return "Student {marks=" +marks + ", name=" + name +", age="+age +'}';
    }

    @Override
    public int compareTo(Student s){
        return  Integer.compare(this.marks,s.marks);
    }
}

public class Map3 {
    public static void main(String[] args){
        ArrayList<Student> sec= new ArrayList<>();

        sec.add(new Student(10,"anony1",23));
        sec.add(new Student(9,"anony2",20));
        sec.add(new Student(4,"anony3",21));
        sec.add(new Student(10,"anony4",19));
        sec.add(new Student(8,"anony5",23));
        sec.add(new Student(13,"anony6",17));
        sec.add(new Student(8,"anony7",18));

        Collections.sort(sec,( a, b)->{
         if(a.age!=b.age){
             return a.age-b.age;
         }

         return a.marks-b.marks;

        });


        System.out.println(sec.toString());

    }
}
