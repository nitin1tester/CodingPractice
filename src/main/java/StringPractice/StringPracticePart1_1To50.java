package StringPractice;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
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
    public static String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
    public static ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
    public static String[] arrFruit = {"apple", "banana", "apricot", "blueberry", "avocado", "cherry"};


    public static char GetCharacterAtIndex(String str, int num) {
        char[] arrChar = OriginalString.toCharArray();
        System.out.println("Character at " + num + " is " + arrChar[num]);
        return arrChar[num];
    }

    public static String ConcatenateTwoStrings(String str1, String str2) {
        System.out.println(str1.concat(" " + str2));
        return str1.concat(str2);
    }

    public static boolean ContainsSpecifiedSequence(String str, String word) {
        System.out.println(str.contains(word));
        return str.contains(word);
    }

    public static boolean CompareWithCharSequence(String str3, String str4) {
        System.out.println(str3.contentEquals(str4));
        return str3.contentEquals(str4);
    }

    public static boolean CaseInsensitiveStringCompariso(String str, String str0) {
        System.out.println(str.toLowerCase().contentEquals(str0.toLowerCase()));
        return str.toLowerCase().contentEquals(str0.toLowerCase());
    }

    public static String ReverseString(String str) {
        String reverseStr = Arrays.stream(str.split("")).reduce("", (a, b) -> b + a);
        System.out.println("This is reverse str : " + reverseStr);
        return reverseStr;
    }

    public static void CountFrequencyOfEachCharacterInAString() {
        String str = "nitin";
        System.out.println(str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())));
    }

    public static void FindFirstNonRepeatingCharacter() {
        String str = "nitin";
        str.chars().mapToObj(c -> (char) c).distinct().forEach(System.out::println);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chArr = str.toCharArray();
        for (int i = chArr.length - 1; i >= 0; i--) {
            sb.append(chArr[i]);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static @NotNull Boolean isPalindrome(@NotNull String str) {
        String strUpperCase = str.toUpperCase();
        String reversedString = StringPracticePart1_1To50.reverseString(strUpperCase);
        System.out.println("This is strUpperCase " + strUpperCase);
        System.out.println("This is reversedString " + reversedString);
        return reversedString.equals(strUpperCase);
    }

    public static @NotNull Map<Character, Integer> numberOfCharOccurrences(@NotNull String str) {
        Map<Character, Integer> myMap = new HashMap<>();
        str = str.toLowerCase();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (myMap.containsKey(arr[i])) continue;

            int counter = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) ++counter;
            }
            myMap.put(arr[i], counter);
        }
        System.out.println(myMap);
        return myMap;
    }

    public static char FirstNonRepeatChar(String str) {
        List<Character> list = new ArrayList<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!list.contains(ch[i])) {
                list.add(ch[i]);
            } else {
                continue;
            }
            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) break;
                if (ch[i] != ch[j] && ch.length - 1 == j) {
                    System.out.println(ch[i]);
                    return ch[i];
                }
            }
        }
        System.out.println('#');
        return '#';
    }

    public static boolean areAnagrams(String str1, String str2) {
        str1.toLowerCase();
        str2.toLowerCase();
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
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

    public static String elementateDuplicatesFromString(String str) {

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
            if (!list.contains(ch[i])) {
                list.add(ch[i]);
                sb.append(ch[i]);
            }
        }
        return sb.toString();

    }

    public static boolean isRotational(String str1, String str2) {
        String temp = str1 + str1;
        System.out.println(temp);
        if (str1.length() != str2.length()) {
            return false;
        }
        return temp.contains(str2);
    }

    /**
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isIsomorphic(String str1, String str2) {
        Map<Character, Character> map = new HashMap<>();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        if (ch1.length != ch2.length) {
            return false;
        }
        for (int i = 0; i < ch1.length; i++) {
            map.put(ch1[i], ch2[i]);
            System.out.println(map);
        }
        return false;
    }

    public static List<Integer> giveVowelsAndConsonants(String strGiven) {
        List<Integer> list = new ArrayList<>();

        String str = strGiven.toLowerCase();
        System.out.println(str);
        char[] arrChar = str.toCharArray();


        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == 'a' || arrChar[i] == 'e' || arrChar[i] == 'i' || arrChar[i] == 'o' || arrChar[i] == 'u') {
                vowelCount++;
            } else {
                if (Character.isLetter(arrChar[i])) {
                    consonantCount++;
                }
            }
        }
        System.out.println("There are " + vowelCount + " vowel & " + consonantCount + " Consonant");
        list.add(vowelCount);
        list.add(consonantCount);
        return list;
    }

    public static boolean oneEditAway(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int editCount = 0;
        if (ch1.length == ch2.length) {
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    editCount++;
                }
            }
        }
        if (editCount == 1) {
            System.out.println("its one " + editCount + " edit away");
            return true;
        } else {
            System.out.println("Its required more then 1 edit ");
            return false;
        }
    }

    public static void charFrequancy(String str) {
        char[] charArr = str.toCharArray();
        Map<Character, Integer> charCounter = new HashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            if (charCounter.containsKey(charArr[i])) {
                charCounter.put(charArr[i], charCounter.get(charArr[i]) + 1);
            } else {
                charCounter.put(charArr[i], 1);
            }
        }
        System.out.println(charCounter);
    }

    public static void stringCharMatch(String str1, String str2) {
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Map<Character, Integer> charCounter = new HashMap<>();
        for (int i = 0; i < charArr1.length; i++) {
            if (charCounter.containsKey(charArr1[i])) {
                charCounter.put(charArr1[i], charCounter.get(charArr1[i]) + 1);
            } else {
                charCounter.put(charArr1[i], 1);
            }
        }
        for (int i = 0; i < charArr2.length; i++) {
            if (charCounter.containsKey(charArr2[i])) {
                charCounter.put(charArr2[i], charCounter.get(charArr2[i]) - 1);
            } else {
                charCounter.put(charArr2[i], -1);
            }
        }
        System.out.println(charCounter);
    }

    public static String compressString(String str) {
        char[] charArr = str.toCharArray();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (char ch : charArr) {
            if (characterIntegerMap.containsKey(ch)) {
                characterIntegerMap.put(ch, characterIntegerMap.get(ch) + 1);
            } else {
                characterIntegerMap.put(ch, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> m : characterIntegerMap.entrySet()) {
            String Ke = m.getKey().toString();
            String vl = m.getValue().toString();

            sb.append(m.getKey() + m.getValue());
            System.out.print(Ke + vl);
        }
        //System.out.println(sb);
        return sb.toString();
    }

    public static String removeAllAdjacentDuplicates(String str) {
        char[] charArr = str.toCharArray();
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < charArr.length; i++) {
            if (!stk.empty() && stk.peek() == charArr[i]) {
                stk.pop();
            } else {
                stk.push(charArr[i]);
            }
        }
        System.out.println(stk);
        return stk.toString();
    }

    public static Map<String, List<String>> anagramList(List<String> strList) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strList) {
            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);
            map.computeIfAbsent(key, k -> new ArrayList<String>()).add(s);
        }
        System.out.println(map.values());
        return map;
    }

    public static Map<Character, List<String>> groupWordsByTheirFirstLetter(String[] str) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        Map<Character, List<String>> map = new HashMap<>();
        for (String word : list) {
            char[] charArray = word.toCharArray();
            map.computeIfAbsent(charArray[0], v -> new ArrayList<>()).add(word);
        }
        System.out.println(map);
        return map;
    }

    public static void returnMaxCharLengthAndWord() {
        String s = "I love nitintintinintintin Java Programming ";
        String[] arrStr = s.split(" ");
        int max = 0;
        String st = null;
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() > max) st = arrStr[i];
            max = arrStr[i].length();
        }
        System.out.println("This is longest word " + st);
        System.out.println(max);
    }

    /**
     * These are Easy questions
     */

    public static String reverseStringNew(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chArr = str.toCharArray();
        for (int i = chArr.length - 1; i >= 0; i--) {
            sb.append(chArr[i]);
        }
        return sb.toString();
    }

    public static boolean isPallindromeNew(String str) {
        /*
         * 1 break String to character array
         * 2 need a String Builder to create a new updated string
         * 3 then reverse string and store to string builder
         * 4 last compare both string
         */
        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();
        for (int i = charArr.length - 1; i >= 0; i--) {
            sb.append(charArr[i]);
        }
        System.out.println("this is new string : " + sb);

        System.out.println("Using one line " + new StringBuilder(sb).toString().equals(str));

        if (sb.toString().equals(str)) {   // note this point as here made mistake
            System.out.println("String is Pallindrom");
            return true;
        } else {
            System.out.println("String is not Pallindrom");
            return false;
        }
    }

    public static List<Integer> CountVowelsAndConsonantsNew(String strGiven) {
        String str = strGiven.toLowerCase();
        List<Integer> listInt = new ArrayList<>();
        int vowelCount = 0;
        int consonantCount = 0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                if (charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u') {
                    vowelCount = vowelCount + 1;
                } else {
                    consonantCount = consonantCount + 1;
                }
            }
        }
        System.out.println("vowelCount : " + vowelCount + " And consonantCount :" + consonantCount);
        listInt.add(vowelCount);
        listInt.add(consonantCount);
        return listInt;
    }

    public static Map<Character, Integer> CountOccurrencesOfEachCharacter(String str) {
        char[] charArr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                if (map.containsKey(charArr[i])) {
                    map.put(charArr[i], map.get(charArr[i]) + 1);
                } else {
                    map.put(charArr[i], 1);
                }
            }
        }
        System.out.println(map);
        return map;
    }

    public static String RemoveDuplicateCharactersNew(String str) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                if (!map.containsKey(charArr[i])) {
                    map.put(charArr[i], 1);
                    sb.append(charArr[i]);
                }
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static char FindFirstNonRepeatingCharacterNew(String str) {
        char fkey = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                if (map.containsKey(charArr[i])) {
                    map.put(charArr[i], map.get(charArr[i]) + 1);
                } else {
                    map.put(charArr[i], 1);
                }
            }
        }
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println("this is key : " + key);
                fkey = key;
                break;
            }
        }
        System.out.println(map);
        return fkey;
    }

    public static String SwapCaseNew(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                if (Character.isUpperCase(charArr[i])) {
                    sb.append(Character.toLowerCase(charArr[i]));
                } else {
                    sb.append(Character.toUpperCase(charArr[i]));
                }
            }
        }
        System.out.println("This is updated sting  : " + sb);
        return sb.toString();
    }

    public static void TwoStringsAreAnagrams(String strr1, String strr2) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArr1 = strr1.toCharArray();
        for (int i = 0; i < charArr1.length; i++) {
            if (map.containsKey(charArr1[i])) {
                map.put(charArr1[i], map.get(charArr1[i]) + 1);
            } else {
                map.put(charArr1[i], 1);
            }
        }
        System.out.println(map);
        char[] charArr2 = strr2.toCharArray();
        for (int i = 0; i < charArr2.length; i++) {
            map.put(charArr2[i], map.get(charArr2[i]) - 1);
            if (map.get(charArr2[i]) == 0) {
                map.remove(charArr2[i]);
            }
        }
        if (map.isEmpty()) {
            System.out.println("Map is empty now");
        } else {
            System.out.println("Map is not empty so its not a Anagrams");
        }
        System.out.println(map);
    }

    public static int CountWordsInASentenceNew(String str) {
        String[] strArr = str.split(" ");
        System.out.println("Number of words : " + strArr.length);
        return strArr.length;
    }

    public static String ReverseEachWordInSentence(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            sb.append(StringPracticePart1_1To50.reverseStringNew(strArr[i]) + " ");
        }
        System.out.println("This is updated string : " + sb.toString().trim());

        return sb.toString().trim();


    }

    /**
     * Medium level questions
     *
     * @param args
     */

    public static void LongestWordInSentenceNew(String str ){
        int largewortdlength = 0;
        String largeWord = "";
        String[] strArr = str.trim().split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > largewortdlength) {
                largewortdlength = strArr[i].length();
                largeWord = strArr[i];
            }
        }
        System.out.println("Large word : " + largeWord);
    }


    public static int countOccurance(String str1, Character c){
        String str = str1.toLowerCase();
        Map<Character,Integer> map = new TreeMap<>();
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                if (map.containsKey(charArr[i])) {
                    map.put(charArr[i],map.get(charArr[i])+1);
                }else{
                    map.put(charArr[i],1);
                }
            }
        }
        System.out.println(map);
        if (map.containsKey(c)) {
            System.out.println("This is count for "+ c+ " : " + map.get(c));
            return map.get(c);
        }else {
            System.out.println("This is count for "+ c+ " : " + 0);
            return 0;
        }
    }

    private static void reverseStr(String strg) {
        char[] charArr = strg.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = charArr.length-1; i >= 0; i--) {
            sb.append(charArr[i]);
        }
        System.out.println(sb);
    }

    private static void reverseStrWord(String str) {
        String[] strWord = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strWord.length-1; i >=0  ; i--) {
            sb.append(strWord[i] + " " );
        }
        System.out.println(sb);
    }

    private static boolean Palindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            System.out.println(ch);
              sb.append(ch);
        }
        System.out.println("this is sb : " + sb);
        if (str.equals(sb.toString())) {
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }
    private static boolean Palindrome1(String str) {

        int start = 0;
        int end = str.length()-1;

        while(start < end){
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println(false);
                return false;
            }
            start++;
            end--;
        }
        System.out.println(true);
        return true;
    }
    private static void TwoStringsAreAnagramsNew(String strOne, String strTwo) {
        char[] strOneArr = strOne.toCharArray();
        char[] strTwoArr = strTwo.toCharArray();
        Set<Character> setOneArr = new HashSet<>();
        Set<Character> setTwoArr = new HashSet<>();
        for (char c1 : strOneArr){
            setOneArr.add(c1);
        }
        System.out.println(setOneArr);
        for (char c2 : strTwoArr){
            setTwoArr.add(c2);
        }
        System.out.println(setTwoArr);
        if (setTwoArr.equals(setOneArr)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    private static boolean TwoStringsAreAnagramsNew1(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            System.out.println("Not anagram");
        }
        char[] ch1 =  strOne.toCharArray();
        char[] ch2 = strTwo.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch2,ch1));
        return Arrays.equals(ch2,ch1);

    }

    private static void returnLongestContinueAlfabaticalSubstring(String str) {
        int currentLength = 0;
        int longestString = 0;
        int startIndex = 0;
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[str.length()];
        char[] chArr = str.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            arr[i] = (int)chArr[i];
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            if((arr[i+1]-arr[i]) == 1){
                sb.append((char)arr[i]);
            }
        }
        System.out.println(sb);
    }

    private static void returnLongestContinueSubstringNew(String str) {
        int start = 0;
        int maxStart = 0;
        int currentlength = 1;
        int maxLength = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i+1)-str.charAt(i)==1) {
                currentlength++;
                if (currentlength > maxLength) {
                    maxLength = currentlength;
                    maxStart = start;
                }
            }else {
                currentlength = 1;
                start = i+1;
            }
        }
        System.out.println("Now maxStart : "+ maxStart + ", And Max length : "+ maxLength);
        System.out.println(str.substring(maxStart, maxStart + maxLength));

    }


    // I am main Method
    public static void main(String[] args) {
        returnLongestContinueSubstringNew("agfhgbwabcdefghijbvchsjdebnxkabcdefbsww");
    }



}
