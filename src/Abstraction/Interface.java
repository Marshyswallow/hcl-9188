package Abstraction;

public class Interface {
    public static void main(String[] args){

        fly.fly();
    }
}

//we have to define every method if a class implements a method in the interface
//interface method can be static and final
interface fly{
    public static void fly() {
        System.out.println("birds can fly");
    };
}


