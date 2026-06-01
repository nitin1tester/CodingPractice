package JavaTraining.MethodCalling;

public class Employee {

    String name;
    int age;

    public static void getInfo(Employee obj){
        System.out.println("This is emp name : "+obj.name);
        System.out.println("This is emp age : "+obj.age);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Nitin";
        e1.age = 35;
        Employee.getInfo(e1);
    }

}
