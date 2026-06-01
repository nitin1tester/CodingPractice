package JavaTraining.MethodCalling;

public class User {

    public void m1(){
        System.out.println("I am m1 method");
        m2();
    }

    public void m2(){
        System.out.println("I am m2 method");
        m3();

    }

    public void m3(){
        System.out.println("I am m3 method");
        t2();

    }

    public static void t1(){
        System.out.println("I am t1 method");
        User u2 = new User();
        u2.m1();

    }

    public static void t2(){
        System.out.println("I am t2 method");
        t3();
    }

    public static void t3(){
        System.out.println("I am t3 method");

    }

    public static void main(String[] args) {
        //NS >>> S > Use Class Name
        //NS >>> NS > user directly
        //S >>> S > use with class name.
        //S >>> NS > create Object and use

        User u1 = new User();
        u1.m1();
//        User.t1();
    }

}
