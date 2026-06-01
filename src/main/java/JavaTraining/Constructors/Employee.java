package JavaTraining.Constructors;

public class Employee {

    String name;
    int age;
    boolean isActive;
    double salary;

    public Employee(){
        System.out.println("I am Employee Const only ");
    }

    public Employee(int num){
        System.out.println("I am Employee Const with param ");
    }

    public Employee(int num, int num1){
        System.out.println("I am Employee Const with two param ");
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(); // this will call constructor
        e1.name = "Nitin";
        e1.age = 30;
        e1.isActive = true;
        e1.salary = 25.00;

        Employee e2 = new Employee(10);
        e2.name = "Nitin1";
        e2.age = 30;
        e2.isActive = true;
        e2.salary = 25.00;

        Employee e3 = new Employee(1,2);
        e3.name = "Nitin2";
        e3.age = 30;
        e3.isActive = true;
        e3.salary = 25.00;

    }

}
