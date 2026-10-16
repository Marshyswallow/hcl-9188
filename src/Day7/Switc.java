package Day7;

public class Switc {
    public static void main(String[] args){
        String Day="Tuesday";
      int Dayn=  switch (Day){
            case "sunday"-> 1;
          case "monday"->2;
            case "Tuesday"->3;
          case "wednesday"->4;
            case "thursday"->5;
          case "friday"->6;
            case "saturday"->7;
          default->0;
        };
        System.out.println(Dayn);
    }
}
