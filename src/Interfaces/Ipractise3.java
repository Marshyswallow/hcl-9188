package Interfaces;

public class Ipractise3 {
    public static void main(String[] args){
        StreetDog s1=new StreetDog();
        s1.bark();
        s1.eat();
    }
}

//Interface inheritance

interface AnimalEat{
    void eat();
}

interface DogInterface extends AnimalEat{
    void bark();
}

class StreetDog implements DogInterface{
    @Override
    public void bark() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("dog eats");
    }
}
