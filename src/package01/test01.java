package package01;

import package02.Student;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x);

        Student s1=new Student("vishal",20);

        System.out.println(s1.name);

        s1.bunk();
        s1.getRun();
        System.out.println(s1.getAge());


        Faculty f1=new Faculty("khasdbkjb",45);
        System.out.println(f1.age);
    }
}
