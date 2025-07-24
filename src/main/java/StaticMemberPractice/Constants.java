package StaticMemberPractice;

public class Constants {
    static final double pi = 3.14159;
    public static double circleArea(int radius){
        return (pi*radius*radius);
    }
    public static void main(String[] args) {
        System.out.println("Area of Circle "+circleArea(5));
    }
}
