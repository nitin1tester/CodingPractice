package NestedClassPractice;

public class University {

    public static class Department{
        void displayInfo(){
            System.out.println("This is displayInfo methord in department");
            System.out.println("number of faclity");
        }
    }

    public static void main(String[] args) {
        Department department = new Department();
        department.displayInfo();
    }

}
