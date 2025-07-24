package StringPractice;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.devtools.v113.domsnapshot.model.StringIndex;

import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.Collectors;

public class StringPracticePart1_1To50 {

    public static String OriginalString = "Java Exercises!";
    public static String str1 = "PHP Exercises and";
    public static String str2 = "Python Exercises";
    public static String str3 = "example.com";
    public static String str4 = "example.com";
    public static String str5 = "This is exercise 1";
    public static String str6 = "This is Exercise 1";



    public static char  GetCharacterAtIndex(String str, int num){
        char[] arrChar =  OriginalString.toCharArray();
        System.out.println("Character at "+ num +" is " +arrChar[num]);
        return arrChar[num];
    }

    public static String ConcatenateTwoStrings(String str1, String str2){
        System.out.println(str1.concat(" "+str2));
        return str1.concat(str2);
    }

    public static boolean ContainsSpecifiedSequence(String str, String word){
        System.out.println(str.contains(word));
        return str.contains(word);
    }

    public static boolean CompareWithCharSequence(String str3, String str4){
        System.out.println(str3.contentEquals(str4));
        return str3.contentEquals(str4);
    }

    public static boolean CaseInsensitiveStringCompariso(String str, String str0){
        System.out.println(str.toLowerCase().contentEquals(str0.toLowerCase()));
        return str.toLowerCase().contentEquals(str0.toLowerCase());
    }

    public static String ReverseString(String str){
        String reverseStr = Arrays.stream(str.split("")).reduce("",(a,b)->b+a);
        System.out.println("This is reverse str : " + reverseStr);
        return reverseStr;
    }

    public static void CountFrequencyOfEachCharacterInAString(){
        String str = "nitin";
        System.out.println(str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())));
    }

    public static void FindFirstNonRepeatingCharacter(){
        String str = "nitin";
        str.chars().mapToObj(c -> (char) c).distinct().forEach(System.out::println);
    }
     public static String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        char[] chArr = str.toCharArray();
         for (int i = chArr.length-1 ; i >= 0; i--) {
             sb.append(chArr[i]);
         }
         System.out.println(sb.toString());
         return sb.toString();
     }

     public static @NotNull Boolean isPalindrome(@NotNull String str){
        String strUpperCase = str.toUpperCase();
        String reversedString = StringPracticePart1_1To50.reverseString(strUpperCase);
         System.out.println("This is strUpperCase "+strUpperCase);
         System.out.println("This is reversedString "+reversedString);
         return reversedString.equals(strUpperCase);
     }

     public static @NotNull Map<Character,Integer> numberOfCharOccurrences(@NotNull String str){
        Map<Character,Integer> myMap = new HashMap<>();
        str = str.toLowerCase();
        char[] arr = str.toCharArray();

         for (int i = 0; i < arr.length; i++) {
             if (myMap.containsKey(arr[i])) continue;

             int counter = 1;
             for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j] )
                        ++counter;
             }
             myMap.put(arr[i],counter);
         }
         System.out.println(myMap);
         return  myMap;
     }

     public static char FirstNonRepeatChar(String str){
        List<Character> list = new ArrayList<>();
        char[] ch = str.toCharArray();
         for (int i = 0; i < ch.length; i++) {
             if (!list.contains(ch[i])){
                 list.add(ch[i]);
             } else {
                 continue;
             }
             for (int j = i+1; j < ch.length; j++) {

                 if (ch[i] == ch[j]) break;
                 if (ch[i] !=ch[j] && ch.length-1 == j ) {
                     System.out.println(ch[i]);
                     return ch[i];
                 }
             }
         }
         System.out.println('#');
         return '#';
     }

     public static boolean areAnagrams(String str1, String str2){
        str1.toLowerCase();
        str2.toLowerCase();
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
//         if (ch1.length != ch2.length) {
//             System.out.println("Its not an Anagrams");
//             return false;
//         }else {
//             for (int i = 0; i < ch1.length; i++) {
//                 if (ch1[i] != ch2[i]) {
//                     System.out.println("Its not an Anagrams");
//                     return false;
//                 }
//             }
//             System.out.println("Its an Anagrams");
//             return true;
//         }
     }
     public static String elementateDuplicatesFromString(String str){

//        Set<Character> hSet = new HashSet<>();
//        Set<Character> tSet = new TreeSet<>();
//        Set<Character> lHSet = new LinkedHashSet<>();
//
//        for(char c : str.toCharArray()){
//            hSet.add(c);
//            tSet.add(c);
//            lHSet.add(c);
//
//        }
//         System.out.println("This is HashSet "+hSet);
//         System.out.println("This is TreeSet "+tSet);
//         System.out.println("This is LinkedHashSet" + lHSet);
//        return hSet.toString();


         List<Character> list = new ArrayList<>();
         StringBuilder sb = new StringBuilder();
         char[] ch = str.toCharArray();
         for (int i = 0; i < ch.length; i++) {
             if (!list.contains(ch[i]) ) {
                list.add(ch[i]);
                sb.append(ch[i]);
             }
         }
         return sb.toString();

     }
     public static boolean isRotational(String str1, String str2){
        String temp = str1+str1;
         System.out.println(temp);
         if (str1.length() != str2.length()) {
             return false;
         }
         return temp.contains(str2);
     }

    /**
     *
     * @param str1
     * @param str2
     * @return
     */
     public static boolean isIsomorphic(String str1, String str2){
        Map<Character,Character> map = new HashMap<>();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
         if (ch1.length != ch2.length) {
            return false;
         }
         for (int i = 0; i < ch1.length; i++) {
            map.put(ch1[i],ch2[i]);
             System.out.println(map);
         }
         return false;
     }

     public static List<Integer> giveVowelsAndConsonants(String strGiven){
         List<Integer> list = new ArrayList<>();
         
         String str = strGiven.toLowerCase();
         System.out.println(str);
         char[] arrChar = str.toCharArray();


         int vowelCount = 0;
         int consonantCount = 0;
         for (int i = 0; i < arrChar.length; i++) {
             if (arrChar[i] == 'a'|| arrChar[i] == 'e'|| arrChar[i] == 'i' || arrChar[i] == 'o' || arrChar[i] == 'u'  ) {
                 vowelCount++;
             }else {
                 if (Character.isLetter(arrChar[i])) {
                     consonantCount++;
                 }
             }
         }
         System.out.println("There are "+ vowelCount +" vowel & "+ consonantCount +" Consonant" );
         list.add(vowelCount);
         list.add(consonantCount);
         return list;
     }

     public static boolean oneEditAway(String str1, String str2){
         char[] ch1 =  str1.toCharArray();
         char[] ch2 =  str2.toCharArray();
         int editCount = 0;
         if (ch1.length == ch2.length) {
             for (int i = 0; i < ch1.length; i++) {
                     if (ch1[i] != ch2[i]) {
                         editCount++;
                     }
             }
         }
         if (editCount == 1 ) {
             System.out.println("its one " + editCount +" edit away");
             return true;
         }else {
             System.out.println("Its required more then 1 edit ");
             return false;
         }
     }
    public static void main(String[] args) {
       StringPracticePart1_1To50.oneEditAway("pade", "pede");
    }

}
