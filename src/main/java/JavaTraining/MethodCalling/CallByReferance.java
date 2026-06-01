package JavaTraining.MethodCalling;

public class CallByReferance {
    public void m1(){
        System.out.println("I am m1 method");
    }

    public void m2(){
        System.out.println("I am m2 method");
    }

    public void m3(){
        System.out.println("I am m3 method");
    }

    public static void t1(CallByReferance referance){
        System.out.println("I am t1 method");
        //t1 call m1 method
        referance.m1();
    }

    public static void t2(){
        System.out.println("I am t2 method");
    }

    public static void t3(){
        System.out.println("I am t3 method");
    }

    public static void main(String[] args) {
        CallByReferance cbr = new CallByReferance();
//        cbr.m1();
        //Main will call t1 static method
        CallByReferance.t1(cbr); // call by referance

    }
}
