package Basic_Part_I;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem12 {
    public  static void main(String[] args){
        /*
        * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        *
        * */

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int number1 = in.nextInt();
        System.out.println("Please enter number 2");
        int number2 = in.nextInt();
        System.out.println("please enter number 3");
        int number3 = in.nextInt();
        System.out.println("please enter number 4");
        int number4 = in.nextInt();
        System.out.println("please enter number 5");
        int number5 = in.nextInt();

        int avg = (number1+number2+number3+number4+number5)/5;
        System.out.println("Average of numbers :"+ avg);



    }
}
