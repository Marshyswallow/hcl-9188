package Interfaces;

public class Ipractise1 {
    public static void main(String[] args){
        Dog d=new Dog();
        d.bark();
        d.run();
    }
}

interface human{
    void run();
}

interface animal{
    void bark();
}

class Dog implements human,animal{
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
