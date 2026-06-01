package JavaTraining.ExceptionHandling;

public class Customer {

    String name;

    public static void main(String[] args) {
        System.out.println("Printing customer information");

        try{
            int i = 9/3; // AE
            Customer customer = new Customer();
            customer = null;
            System.out.println(customer.name);// NPE
        }catch (ArithmeticException e){
            System.out.println(" AE is coming");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("NPE is coming ");
            e.printStackTrace();
        }
        System.out.println("bye");

    }

}
