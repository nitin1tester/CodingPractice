package StaticMemberPractice;

public class ComplexInitializer {

    static int x;
    static int y;
    static int z;

    static{
        x=2;
        y=3;
        z= calculateZ(x,y);
    }

    static{
        x=4;
        y=5;
        z= calculateZ(x,y);
    }

    public static int calculateZ(int x, int y){
        return z = (x+y)*(x*y);
    }

    public static void main(String[] args) {
        System.out.println("This is value of X "+x);
        System.out.println("This is value of Y "+y);
        System.out.println("This is value of Z "+z);
    }

}
