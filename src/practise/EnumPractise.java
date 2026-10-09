package practise;

public class EnumPractise {
    public static void main(String[] args){
        Direction d=Direction.NORTH;
        System.out.println(d.name());
        System.out.println(d.valueOf("NORTH"));
        System.out.println(d.ordinal());

        Direction[] directions=Direction.values();

        for(Direction da:directions){
            System.out.println(da.name());
        }

    }
}

enum Direction{
    NORTH(0),
    SOUTH(90),
    EAST(30),
    WEST(120);

    private int degree;

    Direction(int degree){
        this.degree=degree;
    }

    public int getDegree(){
        return this.degree;
    }
}
