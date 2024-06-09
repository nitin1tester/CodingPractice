package Basic_Part_I;

public class Problem11 {
    static float pi = 22/7f;
    public static void main(String[] args){
        /*
        * Write a Java program to print the area and perimeter of a circle.
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586
        *
        * */

        float Radius = 7.5f;
        double Area = (pi)*Radius*Radius;
        double Perimeter = 2*(pi)*Radius;
        System.out.println("Perimeter is = " +Perimeter);
        System.out.println("Area is = "+Area );


    }
}
