package Interfaces;

public class MultipleInherit {
    public static void main(String [] args){

        c c1=new c();
        c1.fun();
        c1.fun2();
    }
}

//Multiple Inheritance-> Interfaces

interface a{
    void fun();
}

interface b{
    void fun2();
}

class c implements a,b{
    @Override
    public void fun() {
        System.out.println("fun1");
    }

    @Override
    public void fun2() {
        System.out.println("fun2");
    }
}
