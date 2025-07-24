package StaticMemberPractice;

public class IDGenerator {

    public static int nextID = 0;
    public static int generateID(int counter){
         return nextID = counter+1;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
                int num = generateID(nextID);
                System.out.println("This is your ID "+num);
        }
    }

}
