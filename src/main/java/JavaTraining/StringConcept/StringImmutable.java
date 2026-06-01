package JavaTraining.StringConcept;

public class StringImmutable{

    public static void main(String[] args) {

        String s1 = "hello";
        s1 = s1 + " world";
        System.out.println(s1);
        String s2 = " Nitin";
        s1 = s1 + s2;
        System.out.println(s1);
        s1 = "good one ";
        System.out.println(s1);

    }

}
