package JavaTraining.MethodOverloadingConcept;

public class Employee {


    public void test(){

    }

    public void test(String str){

    }

    public void test(int num){

    }

    public void test(int a, int b){

    }

    public void test(String str, int b){

    }

    public void test(int num, String str){

    }

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.test();

    }

}
