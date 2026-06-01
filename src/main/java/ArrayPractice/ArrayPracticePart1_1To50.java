package ArrayPractice;

import java.rmi.dgc.Lease;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayPracticePart1_1To50 {

    public static Integer[] arrNum = {9,8,7,6,5,4,3,2,1,0, 10,23,145,4,634,676, 10, 10 ,47,74, 10 ,34,24,99,221,65, 77,412,10,2,354,0,3,6,5,4,3,2,1,0,534,53,42, 10,34,234,23,423,34,0,24,423,6,35,746,432};
    public static Integer[] arrNum2 ={2,1,0,23,145,4,634,676,47,74,34,24,221,412,2,354,3,534,53,42,34,234};
    public static String[] arrStr = {"nitin", "test", "data", "nitin", "test", "same", "abc", "same", "nitin", "test", "mukesh", "shivansh", "good", "bad", "smart", "one", "two", "three", "one"};
    public static String[] arrStr2 = {"nitin", "test", "data", "nitin", "test", "same", "abc", "same","shivansh","mahesh", "nitin", "test", "mukesh", "shivansh","mahesh", "hard"};
    public static Integer[] array1 = {2, 5, 7, 9, 11};
    public static Integer[] array2 = {2, 5, 7, 11};
    public static Integer[] array3 = {2, 5, 7, 9, 11};
    public static Integer[] arrNum3 = {10, 77, 10, 54, -11, 10};
    public static Integer[] arrNum4 = {1, -2, 0, 5, -1, -4, 2};
    public static Integer[] arrNum5 = {1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2};
    public static Integer[] arrNum6 = {10, 9, 14, 23, 15, 0, 9, 8};
    public static int[] arrNum7 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    public static Integer[] arrNum8 = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
//    public static Integer[] arrNUM9 = {−2, 1, −3, 4, −1, 2, 1, −5, 4};




    public static Integer[] InsertElementAtSpecificPosition(){
        int insertIndex = 5;
        int insertValue = 49;
        //int[] myInsertIndex = new int[]{arrNum.length};
        for (int i = arrNum.length-2; i >= insertIndex ; i--) {
            arrNum[i+1] = arrNum[i];
        }
        arrNum[insertIndex] = insertValue;
        System.out.println(Arrays.toString(arrNum));
        return arrNum;
    }
    public static void FindMaxAndMinInAnArray(){
        Arrays.sort(arrNum);
        System.out.println("This is min "+arrNum[0]);
        System.out.println("This is max "+arrNum[arrNum.length-1]);
    }
    public static Integer[] ReverseAnIntegerArray(){
        for (int i = 0; i < arrNum.length/2; i++) {
            int temp = arrNum[i];
            arrNum[i] = arrNum[arrNum.length-1-i];
            arrNum[arrNum.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arrNum));
        return arrNum;

    }
    public static void FindDuplicatesInIntegerArray(){
        Arrays.sort(arrNum);
        //int[] myArray = new int[arrNum.length];
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arrNum.length-1; i++) {
            if (arrNum[i] ==arrNum[i+1]) {
                arrayList.add(arrNum[i]);
            }
        }
        System.out.println(arrayList);
    }
    public static void FindDuplicatesInStringArray(){
        Arrays.sort(arrStr);
        Set<String> arraySetStr = new HashSet<>();
        for (int i = 0; i < arrStr.length-1; i++) {
            if(arrStr[i] == arrStr[i+1]){
                arraySetStr.add(arrStr[i]);
            }
        }
        System.out.println(arraySetStr);
    }
    public static void CommonElementsInTwoStringArrays(){
        Set<String> arraySet = new HashSet<>();
        for (int i = 0; i < arrStr.length-1; i++) {
            for (int j = 0; j < arrStr2.length-1; j++) {
                if (arrStr[i] == arrStr2[j]) {
                    arraySet.add(arrStr[i]);
                }
            }
        }
        System.out.println(arraySet);
    }
    public static void CommonElementsInTwoIntegerArrays(){
        Set<Integer> arraySet = new HashSet<>();
        for (int i = 0; i < arrNum.length-1 ; i++) {
            for (int j = 0; j < arrNum2.length; j++) {
                if (arrNum[i] == arrNum2[j]) {
                    arraySet.add(arrNum[i]);
                }
            }
        }
        System.out.println(arraySet);
    }
    public static void RemoveDuplicatesFromArray(){
        Set<Integer> arraySet = new HashSet<>();
        for (int i = 0; i < arrNum.length-1; i++) {
            arraySet.add(arrNum[i]);
        }
        Integer[] arrNew =  arraySet.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arrNew));

//        for (int i = 0; i < arrNew.length-1; i++) {
//            System.out.println(arrNew[i]);
//        }

    }
    public static void FindSecondLargestArrayElement(){
        Arrays.sort(arrNum);
        System.out.println(" I am 2nd highest " + arrNum[arrNum.length-2]);
        System.out.println(" I am 2nd smallest " + arrNum[1]);
    }
    public static void ConvertArrayToArrayList(){
        List<String> arraylist = new ArrayList<>();
        for(String str : arrStr){
            arraylist.add(str);
        }
//        System.out.println(arraylist);
        String[] newArray = arraylist.toArray(new String[0]);
        System.out.println(Arrays.toString(newArray));
    }
    public static void ConvertArrayListToArray(){
        List<String> arrList = new ArrayList<>();
        arrList.add("nitin");
        arrList.add("nitin1");
        arrList.add("nitin3");
        arrList.add("nitin4");
        arrList.add("nitin5");
        arrList.add("nitin6");
        arrList.add("nitin7");
        arrList.add("nitin8");
//        System.out.println(arrList);
        String[] newStr = arrList.toArray(new String[0]);
        System.out.println(Arrays.toString(newStr));
    }

    public static void FindPairsWithAGivenSum(){
        int[] givenArray = {1,2,3,4,5,6};
        int sum = 6;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < givenArray.length-1; i++) {
            for (int j = i+1; j < givenArray.length-1; j++) {
                if (givenArray[i]+ givenArray[j] == sum) {
                    System.out.println("Sum of "+givenArray[i]+" & "+ givenArray[j]+" is " + sum);
                }
            }
        }
    }

    public static boolean CheckIfTwoArraysAreEqual(int[] arr1, int[] arr2 ){
        if(arr1.length != arr2.length){
            System.out.println("Array are not equal");
            return false;
        }else{
            for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i] != arr2[i]) {
                        System.out.println("Array are not equal");
                        return false;
                    }
            }
        }
        System.out.println("Array are equal");
        return true;
    }

    public static int FindMissingNumberInArray(int[] arr1, int[] arr2){
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();

        System.out.println("This is sum1 "+ sum1);
        System.out.println("This is sum2 "+ sum2);

        if (sum2 > sum1) {
            int num = sum2 - sum1;
            System.out.println("this number is missing "+ num);
            return num;
        }else {
            int num = sum1 - sum2;
            System.out.println("this number is missing "+ num);
            return num;
        }
    }

    public static Set<Integer> CommonElementsInThreeSortedArrays(Integer[] arr1, Integer[] arr2, Integer[] arr3){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(arr3));
        set1.retainAll(set2);
        set1.retainAll(set3);
        System.out.println("This is set" +set1);
        return set1;
    }

    public static void MoveAll0sToArrayEnd( Integer[] arr){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        Iterator<Integer> iterator = arrayList.iterator();
        int zeroCount = 0;
        while (iterator.hasNext()){
            if(iterator.next() == 0){
                iterator.remove();
                zeroCount++;
            }
        }
        for (int i = 0; i <= zeroCount; i++) {
            arrayList.add(0);
        }
        System.out.println(arrayList);
    }

    public static void CountEvenAndOddNumbersInArray(Integer[] arr ) {
        int evenCount = 0;
        int oddCount = 0;
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Number count " + evenCount);
        System.out.println("Odd Number count " + oddCount);
        System.out.println(arr.length);
    }

    public static Integer DifferenceBetweenMaxAndMinValues(Integer[] arr){
        Arrays.sort(arr);
        int num = arr[arr.length-1] - arr[0];
        System.out.println("This is number " + num);
        return num ;
    }

    public static void AverageExcludingMaxAndMin(Integer[] arr){
        Arrays.sort(arr);
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        int min = Collections.min(arrayList);
        int max = Collections.max(arrayList);
        Iterator<Integer> iterator = arrayList.iterator();
        int sum = 0;
        int count = 0;
        while(iterator.hasNext()){
            sum = sum + iterator.next();
            count++;
        }
        System.out.println((sum-(max+min))/(count-2));
    }

    public static void CheckIfArrayExcludes0And(Integer[] arr){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        if (arrayList.contains(0) && arrayList.contains(-1)) {
            System.out.println("This array contains 0 & -1 both");
        }else{
            System.out.println("This array don't contain 0 & -1");
        }
    }

    public static void CheckIfTotalOf10sEquals30(Integer[] arr, int sum){
        List<Integer> arrarList = new ArrayList<>(Arrays.asList(arr));
        int adding = 0;
        for (int num : arrarList){
            if (num == 10) {
                adding = adding + num;
            }
        }
        System.out.println("This is adding value "+adding);
        if (adding == sum){
            System.out.println("Sum to 10's are "+sum);
        }else {
            System.out.println("Sum to 10's are "+adding);
        }
    }

    public static void CheckIfArrayHas65And77(Integer[] arr){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        if (arrayList.contains(65) && arrayList.contains(77)){
            System.out.println("This array contains 65 & 77");
        }else {
            System.out.println("This array don't contain 65 & 77");
        }
    }

    public static int RemoveDuplicatesAndReturnNewLength(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);
        System.out.println("This is size of new set "+set.size());
        return set.size();
    }

    public static int FindLengthOfLongestConsecutiveSequence(Integer[] arr){
        Arrays.sort(arr);
        Set<Integer> sortedSet = new HashSet<>(Arrays.asList(arr));
        List<Integer> sortedList = new ArrayList<>(sortedSet);
        System.out.println(sortedList);
        int longest = 1;
        int flag = 1;
        for (int i = 1; i < sortedList.size()-1; i++) {
            if (sortedList.get(i) == sortedList.get(i-1)+1) {
                flag++;
            }else {
                flag = 1;
            }
            longest = Math.max(longest,flag);
        }
        System.out.println("this is longest "+ longest);
        return longest;
    }

    public static List FindTwoElementsWithTargetSum(Integer[] arr, int sum){
        List<List<Integer>> listList = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] + arr[j] == sum) {


                    List<Integer> listNum = new ArrayList<>();
                    listNum.add(arr[i]);
                    listNum.add(arr[j]);
                    listList.add(listNum);
                }
            }
        }
        System.out.println(listList);
        return listList;
    }

    public static List FindTripletsSummingToGivenNumber(Integer[] arr, int sum){
        List<List<Integer>> listList = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length-1; k++) {
                    if (arr[i]+arr[j]+arr[k] == sum) {
                        List<Integer> listNum = new ArrayList<>();
                        listNum.add(arr[i]);
                        listNum.add(arr[j]);
                        listNum.add(arr[k]);
                        listList.add(listNum);
                    }
                }
            }
        }
        System.out.println(listList);
        return listList;
    }

    public static int FindMajorityElementInArray(Integer[] arr){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(arrayList);
        int num = 0;
        int flag = 0;
        int longest = 1;
        for (int i = 1; i <arrayList.size()-1 ; i++) {
            if (arrayList.get(i) == arrayList.get(i-1)) {
                flag++;
                num = arrayList.get(i-1);
            }else{
                flag = 0;
            }
            longest = Math.max(longest,flag);
            num = arrayList.get(i-1);
        }
        System.out.println("This is num "+num);
        return num;
    }

    public static Set PrintAllLeaderElementsInArray(Integer[] arr){
        Set<Integer> setList = new HashSet<>();
        int Leader;
        for (int i = 0; i <= arr.length-1; i++) {
            int flag = 1;
            Leader = arr[i];
            for (int j = i+1; j <= arr.length-1; j++) {
                if (arr[i]<arr[j]) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                setList.add(Leader);
            }
        }
        System.out.println(setList);
        return setList;
    }
    //{1, 5, -4, 7, 8, -6};
    public static void FindPairWithSumClosestToZero(Integer[] arr){

    }
    //{1, 5, -4, 7, 8, -6};
    public static void FindSmallestAndSecondSmallestInAnArray(Integer[] arr){
        Arrays.sort(arr);
        System.out.println("Two smallest "+arr[0]+ " & "+ arr[1] );
    }
    public static void problem(){
        List<String> names = Arrays.asList("Alice", "Bob", "Adam", "Eve", "Andrew", "Brian");
        Collections.sort(names);
        System.out.println(names);
        int count = 0;
        for (String str: names){
            if (str.startsWith("A")) {
                count++;
            }
        }
        System.out.println("Count is "+count);
    }
    public static void problem2(){
        List<String> names = Arrays.asList("Alice", "Bob", "Adam", "Eve", "Andrew", "Brian");
        StringBuilder sb = new StringBuilder();
        for (String st : names){
            sb.append(st.toUpperCase()+ ", ");
        }
        System.out.println(sb);
    }
    public static void problem3(){
        List<Integer> numbers = Arrays.asList(3, 6, 9, 12, 15, 18, 21);
        List<String> names = Arrays.asList("Nitin", "Ajay", "Rahul", "Amit");
        List<Integer> num =  numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
        List<Integer> num2 =  numbers.stream().filter(n->n%2==1).map(n->n*n).collect(Collectors.toList());
        List<Integer> str1 =  names.stream().map(s->s.length()).collect(Collectors.toList());
        List<Integer> num3 = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(num3);
    }
    public static void RemoveDuplicateUsingCollection(){
        List<Integer> arrayList = new ArrayList<>(Arrays.stream(arrNum).toList());
        List<Integer> newArray =  arrayList.stream().distinct().collect(Collectors.toList());
        List<Integer> sortedArray = newArray.stream().sorted().collect(Collectors.toList());
//        List<Integer> min = arrayList.stream().min(Comparator.naturalOrder()));
        System.out.println();
    }

    public static void Separate0sAnd1sInAnArrayOf0sAnd1s(Integer[] arr){
        List<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        List<Integer> sortedList = arrList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }

//    public static void FindAllCombinationsOfFourElementsSummingToTarget(){
//        for (int i = 0; i < ; i++) {
//
//        }
//    }

    public static int returnMaxSumOfSubstring(int[] arr){
        int currentSum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (max < currentSum) {
                    currentSum = currentSum + arr[i];
                    max = currentSum;
                }else {
                    break;
                }
            }
        }
        System.out.println("This is sum : " + currentSum);
        return  currentSum;
    }

    private static int[] moveAllZeroToEnd(int[] arr) {
        int[] arrNew = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arrNew.length; i++) {
            if (arr[i] != 0) {
                arrNew[counter] = arr[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(arrNew));
        return arrNew;
    }

    private static int[] moveGivenNumberToEnd(int[] arr, int num) {
        int counter = 0;
        int[] arrNew = new int[arr.length];
        if (num != 0) {
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = num;
            }
        }
        System.out.println(Arrays.toString(arrNew));
        for (int i = 0; i < arrNew.length; i++) {
            if (arr[i] != num ) {
                arrNew[counter] = arr[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(arrNew));
        return arrNew;
    }

    private static List<Integer> twoSumNew(int[] arr, int sum) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == sum) {
                    arrList.add(arr[i]);
                    arrList.add(arr[j]);
                    System.out.println(arrList);
                    return arrList;
                }
            }
        }
        System.out.println(arrList);
        return arrList;
    }

    private static int maxSumOfGivenWindow(int[] arr, int size) {
        int winSum = 0;
        int maxSum = 0;
        for (int i = 0; i < size; i++) {
            winSum = winSum + arr[i];
        }
        for (int i = size; i < arr.length; i++) {
            winSum = winSum - arr[i-size];
            winSum = winSum + arr[i];
            if (winSum > maxSum) {
                maxSum = winSum;
            }
        }
        System.out.println("this is maxSum : " + maxSum);
        return maxSum;
    }

    private static float avarage(Float sum , int size){
        return sum/size;
    }

    private static List<Object> averageOfEverySubarray(int[] arr, int size) {
        List<Object> arrList = new ArrayList<>();
        float windowSum = 0;
        for (int i = 0; i < size; i++) {
            windowSum = windowSum + arr[i];
        }
        arrList.add(avarage(windowSum,size));

        for (int i = size; i < arr.length; i++) {
            windowSum = windowSum -arr[i-size] + arr[i];
            arrList.add(avarage(windowSum,size));
        }
        System.out.println(arrList);
        return arrList;
    }

    private static void smallestArraySumIsEqualToGivenNum(int[] arr, int num) {

        int windowStart = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {

            windowSum = windowSum + arr[windowEnd];

            while (windowSum >= num){


            }
        }


    }




    public static void main(String[] args) {
        int arr[] = {2,1,5,2,3,2};
        smallestArraySumIsEqualToGivenNum(arr, 5);
    }



}
