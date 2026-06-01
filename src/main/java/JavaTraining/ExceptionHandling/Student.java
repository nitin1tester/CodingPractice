package JavaTraining.ExceptionHandling;

public class Student {

    public static int getMarks(String name){
        System.out.println("Getting marks Student ..." + name);

        if (name.equals("Rajat")) {
            try {
                int i = 9/0;
            } catch (ArithmeticException e) {
                System.out.println("AE exception is coming...");
                e.printStackTrace();
            }
            return 90;
        } else if (name.equals("Nitin")) {
            return 95;
        } else if (name.equals("Naveen")) {
            return 10;
        }else{
            System.out.println("Please enter a valid student name...");
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Getting marks ");
        int m = Student.getMarks("Rajat");
        System.out.println("End here :"+ m);
    }

}
