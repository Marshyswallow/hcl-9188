package Day8;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton class created");
    }

    public static Singleton getInstance(){
        if(instance==null) instance=new Singleton();

        return instance;
    }

}
