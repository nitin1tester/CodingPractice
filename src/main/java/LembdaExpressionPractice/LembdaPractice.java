package LembdaExpressionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface AddTwoNum{
    int sum(int a, int b);
}
interface IsStringEmpty{
    boolean IsStringEmpty(String str);
}

interface CalculateFactorial{
    int factorial(int num);
}

interface isPrime{
    boolean prime(int num);
}


public class LembdaPractice {
    public static List<Integer> num = Arrays.asList(42,234,25,234,355764,3,3,5234234,234,63,26,26,3,62,42,3,667,3,3,6);

    public static List str = Arrays.asList("red", "green", "blue", "black", "pink");
//    public static void main(String[] args)
//    {
//        int arr[] = {11,22,33,4,35,63,47,38};
//        int count = arr.length-1;
//        for(int n : arr){
//            System.out.println(arr[count]);
//            count--;
//            System.out.println(n);
//    }
//    }

    public static void main(String[] args) {

        AddTwoNum addTwoNum = ((a, b) -> a+b);
        System.out.println(addTwoNum.sum(3,4));

        IsStringEmpty isStringEmpty = (str ->  str.isEmpty());
        System.out.println(isStringEmpty.IsStringEmpty("Nitin"));

//        ConvertStringsToUpperAndLowercaseUsingLambda convertStringsToUpperAndLowercaseUsingLambda = (str -> str.toUpperCase());
//        System.out.println(convertStringsToUpperAndLowercaseUsingLambda.convertStringsToUpperAndLowercaseUsingLambda("nitin"));


        num.stream().sorted().distinct().filter(n -> n % 2 == 0).forEach(n-> System.out.println(" " + n));

        num.stream().sorted().distinct().filter(n -> n!=0).forEach(n-> System.out.println(n));

         str.stream().sorted().forEach(s-> System.out.println(s));

        System.out.println(num.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0));
        num.stream().sorted().distinct().forEach(n-> System.out.println(n));
        /**
         *  Factorial method
         */
        CalculateFactorial calculateFactorial = (n -> {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact*i;
            }
            return fact;
        });
        System.out.println(calculateFactorial.factorial(5));
        /**
         * Prime method
         */
        isPrime isPrime = (n->{
            int flag = 0;
            for (int i = 2; i < n; i++) {
                if (n%i==0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(n+" is not a prime number !!");
                return false;
            }
                System.out.println(n + " is a prime number !!");
            return true;
        }
        );
        System.out.println(isPrime.prime(17));
    }
}
