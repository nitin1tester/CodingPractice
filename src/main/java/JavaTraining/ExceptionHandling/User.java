package JavaTraining.ExceptionHandling;

public class User {

    public static void div(int a , int b){
        System.out.println("Division numbers");
        int z = 0;
        try {
            z = a/b;
        } catch (ArithmeticException e) {
            System.out.println("AE exception is catch");
            e.printStackTrace();
        }
        System.out.println(z);
    }

    public static void main(String[] args) {
        User.div(10,2);
        System.out.println("Bye!!!");
    }

}
