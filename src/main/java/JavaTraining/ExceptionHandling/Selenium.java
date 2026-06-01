package JavaTraining.ExceptionHandling;

public class Selenium {

    public void m1() throws ArithmeticException  {
        System.out.println("I am M1 method");
        m2();
    }

    public void m2() throws ArithmeticException {
        System.out.println("I am M2 method");
            m3();
    }

    public void m3() throws ArithmeticException {
        System.out.println("I am M3 method");
        int i = 9/0;
    }

    public static void main(String[] args){
        Selenium obj = new Selenium();
        obj.m1();
    }

}
