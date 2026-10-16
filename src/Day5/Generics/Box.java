package Day5.Generics;

public class Box<T> {
    T value;
    T itemCount;

    Box(T value,T itemCount){
        this.value=value;
        this.itemCount=itemCount;
    }

    public void show(){
        System.out.println("No of items: "+itemCount+" Value: "+ value);
    }
}
