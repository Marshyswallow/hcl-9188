package Abstraction;

public class Abstract {
    public static void main(String [] args){

        vishal v1=new vishal();
        v1.marks=10;
        System.out.println(v1.marks);
        v1.result();
    }
}

abstract class student{
    int marks;
    abstract void result();
}

class vishal extends student{

    @Override
    void result(){
        System.out.println("pass");
    }
}