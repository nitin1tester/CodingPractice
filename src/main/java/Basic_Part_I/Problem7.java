package Basic_Part_I;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Problem7 extends Problem6 {
    public static void main(String[] args){
        /*
        * 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80
        *
        * */

        int table = 8;
        for (int i = 1; i <=10 ; i++) {
            Problem6 obj = new Problem6();
            int Result = obj.multiply(table,i );
            System.out.println(table +" X " + i + "  = " + Result );
        }
    }

}
