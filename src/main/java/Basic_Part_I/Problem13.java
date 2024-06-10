package Basic_Part_I;

public class Problem13 {
    public  static void main(String args[]){
        /*
        *
        * 13. Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5

        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20
        * */
        float Width = 5.5f;
        float Height = 8.5f;
        float Area = Width*Height;
        float Perimeter = 2*(Width+Height);
        System.out.println("Area is " + Area);
        System.out.println("Perimeter is "+Perimeter);
    }
}
