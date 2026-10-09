package Interfaces;

public class Ipractise3 {
    public static void main(String[] args){
        StreetDog s1=new StreetDog();
        s1.bark();
        s1.eat();
    }
}

//Interface inheritance

interface Animal{
    void eat();
}

interface dog extends Animal{
    void bark();
}

class StreetDog implements dog{
    @Override
    public void bark() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("dog eats");
    }
}
