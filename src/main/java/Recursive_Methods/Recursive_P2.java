package Recursive_Methods;

import java.util.Scanner;

/*
* 2. Write a Java recursive method to calculate the sum of all numbers from 1 to n.
* */

public class Recursive_P2 {
    public static Integer recursiveSum(Integer number){
        if (number == 0) {
            return 0;
        }
        return number+recursiveSum(number-1);
    }
    public static void main(String[] args){
        System.out.println("Please enter a number for sum");
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        Integer result =  recursiveSum(num);
        System.out.println(result);

    }
}
