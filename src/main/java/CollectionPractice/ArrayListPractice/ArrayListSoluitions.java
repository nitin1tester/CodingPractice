package CollectionPractice.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSoluitions {
    public static List<String> arrayList = new ArrayList<>();

    public static List<String> arrList = Arrays.asList("Nitin", "Shraddha", "Arjun", "Naman", "Ram", "Nitin" ,"Shyam", "Shraddha", "Shraddha", "Shraddha", "Raman", "Rohit");
    private static void printArrayListColor(){
        arrayList.add("Black");
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Pink");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Pink");
        arrayList.add("Blue");
        for (String str : arrayList) {
            System.out.println(str);
        }
        System.out.println("+++++++++++++++");
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        printArrayListColor();
    }

}
