package Day6.ExceptionHandling;

public class ExHandling {
    public static void main(String[] args){
        Divide(10,2);
        Divide(10,0);
    }



    static void Divide(int a, int b) throws ArithmeticException {

        try {

            int c = a / b;

            System.out.println(c);

        } catch (ArithmeticException e) {

            System.out.println(e);

        } finally {

            System.out.println("finally executed");

        }

    }
}

