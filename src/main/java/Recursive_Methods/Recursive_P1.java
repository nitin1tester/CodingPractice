package Recursive_Methods;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/*
 * 1. Write a Java recursive method to calculate the factorial of a given positive integer.
 * */
public class Recursive_P1 {
    @Contract(pure = true)
    public static @NotNull Integer recursiveFactorial(Integer number){
        if (number == 0) {
            return 1;
        }
        number =number*recursiveFactorial(number-1);
        return number;
    }
    public static void main(String[] args){

        System.out.println("Please enter a number for factorial");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer result = recursiveFactorial(num);
        System.out.println(result);

    }

}
