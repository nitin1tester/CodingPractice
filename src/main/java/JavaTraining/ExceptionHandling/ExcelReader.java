package JavaTraining.ExceptionHandling;

public class ExcelReader {

    public static void main(String[] args) {
        String data = null;
        if (data == null) {
            throw new DataException("This is my data Exception message");
        }
    }

}
