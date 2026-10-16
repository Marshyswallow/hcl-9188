package Day6.CustomException;

public class CustomException {
    static void checkAge(int age) throws invalidAgeException{
        if(age<18){
            throw new invalidAgeException("Age is less then 18 not eligible to vote");
        }

        System.out.println("eligible to vote");
    }

    public static void main(String[] args){
        try {
            checkAge(20);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
