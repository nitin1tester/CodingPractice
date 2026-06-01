package JavaTraining.Functions;

public class User {


    public void myMethod(){
        System.out.println("This is myMethod");
        return; // void & Return can't be in same method but in this case its valid cause of its not returing blank return.
    }

    public static void main(String[] args) {
        User user = new User();
        user.myMethod();
        System.out.println("This is args value from main : " + args.toString());
        System.out.println("This is args size from main : " + args.length);
    }


}
