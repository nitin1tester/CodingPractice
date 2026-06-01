package JavaTraining.ExceptionHandling;

import java.io.FileInputStream;

public class CTException {

    public static void main(String[] args) {
        //
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
