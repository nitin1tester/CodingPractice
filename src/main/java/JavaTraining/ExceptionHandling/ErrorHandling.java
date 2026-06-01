package JavaTraining.ExceptionHandling;

public class ErrorHandling {
    public static void m1(){
        System.out.println("Print m1 method");
        m2();
    }
    public static void m2(){
        System.out.println("Print m1 method");
        m1();
    }

    public static void main(String[] args) {
        System.out.println("Start Program !!!");
        try{
            m1();
            //System.out.println("here is error");
        }catch (Error e){
            System.out.println("Stack is fulled");
            //e.printStackTrace();
        }
    }

}
