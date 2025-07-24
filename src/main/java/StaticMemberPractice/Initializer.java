package StaticMemberPractice;

public class Initializer {
    static int initialValue;

    /**
     * This is a static block
     */
    static {
         initialValue = 1000;
    }
    static {
        initialValue = 2000;
    }
    public static void main(String[] args) {
        System.out.println(initialValue);
    }

}
