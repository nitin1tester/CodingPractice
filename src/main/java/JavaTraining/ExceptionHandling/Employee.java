package JavaTraining.ExceptionHandling;

public class Employee {

    public static void main(String[] args) {

        System.out.println("Start program");
        try{
            int i = 9/0; // AE
        }catch(ArithmeticException e ) {
            System.out.println("AE is coming...");
            e.printStackTrace();
        }
        System.out.println("End Program");

    }

}
