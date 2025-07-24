package StreamPractice;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice {

    public static List<Integer> arrNum = Arrays.asList(2,3,4,5,6,6,7,54,34,32,4,5,5);

    public static List<String> arrStr = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

    public static void CalculateAverageOfIntegersUsingStreams(){
        System.out.println(arrNum.stream().mapToDouble(Integer::doubleValue).average());
    }
    public static void ConvertStringsToUpperAndLowercaseUsingStreams(){
        arrStr.stream().map(s -> s.toUpperCase(Locale.ROOT)).forEach(s -> System.out.println(s));
        arrStr.stream().map(s->s.toLowerCase()).forEach(s-> System.out.println(s));
    }
    public static void SumEvenAndOddNumbersInListUsingStreams(){
        arrNum.stream().filter(n-> n%2==0).forEach(n-> System.out.print(n));
        System.out.println("");
        arrNum.stream().filter(n->n%2!=0).forEach(n-> System.out.print(n));
    }
    public static void RemoveDuplicatesFromListUsingStreams(){
        arrNum.stream().distinct().forEach(n-> System.out.println(n));
    }
    public static void CountStringsStartingWithLetterUsingStreams(){
        long num =  arrStr.stream().filter(s->s.startsWith(String.valueOf('R'))).count();
        System.out.println(num);
    }

    public static void SortStringsAToZAndZToAUsingStreams(){
        arrStr.stream().map(s->s.toLowerCase()).map(s -> s.toUpperCase()).sorted().forEach(s-> System.out.println(s));
    }

    public static void FindMaxAndMinInListUsingStreams(){
        int min = arrNum.stream()
                                .min((a,b)-> a - b)
                                    .orElse(0);

        int max = arrNum.stream()
                        .max((a,b)->a-b)
                                .orElse(0);

        System.out.println(min);
        System.out.println(max);
    }

    public static void Find2ndSmallestAndLargestUsingStreams(){
        int max2 = arrNum.stream().distinct().sorted()
                                    .skip(1).findFirst().orElse(-1);
        int min2 =  arrNum.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst().orElse(-1);
        System.out.println(min2 +" & "+ max2);
    }

    public static void main(String[] args) {
        StreamPractice.CountStringsStartingWithLetterUsingStreams();
    }

}
