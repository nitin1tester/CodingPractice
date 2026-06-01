package JavaTraining.ExceptionHandling;

import JavaTraining.MethodCalling.B;

public class Browser {

    String name = "chrome";
    public void open(){
        System.out.println("start");
        try {
            int ar[] = new int[2];
            ar[3] = 10; //AIOB
            int i = 9/0; // AE
            Browser obj = new Browser();
            obj = null;
            System.out.println(obj.name); // NPE
        }
        catch (ArithmeticException e) { // child
            e.printStackTrace();
        }
        catch (NullPointerException e){ // child
            e.printStackTrace();
        }
        catch (RuntimeException e){ // parent
            e.printStackTrace();
        }
        catch (Exception e){ // grandparent
            e.printStackTrace();
        }
        catch (Throwable e){ // great grandParent
            e.printStackTrace();
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        Browser br = new Browser();
        br.open();
    }

}
