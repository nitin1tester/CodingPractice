package JavaTraining.ExceptionHandling;

public class FinallyBlock {



    public static void main(String[] args) {
        System.out.println("Start");
        try {
            int i = 9/0;
        }
        catch (ArithmeticException e) {
            System.out.println("I am in catch block");
            e.printStackTrace();
        }
        finally {
            System.out.println("I am into finally block");
        }
        System.out.println("Bye");
    }

}
