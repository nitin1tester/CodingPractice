package StaticMemberPractice;

public class Counter {

    public static int getCount() {
        return count;
    }

    private static int count;

    public Counter(){
        count = count + 1 ;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        new Counter();
        new Counter();
        System.out.println("This is value of count " + Counter.getCount());

    }
}
