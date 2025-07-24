package ConstructorPractice;

import java.sql.Struct;

public class Student {

    private int studentId;
    private String studentName;
    private char studentGrade;

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    public Student(){
        this(1);
        System.out.println("this is student contructor no param");
    }

    public Student(int studentId){
        this(1,"Nitin Rastogi");
        System.out.println("this is student contructor with only 1 param ");
    }

    public Student(int studentId, String studentName){
        this(2,"Mukesh",'A');
        System.out.println("this is student contructor with only 2 param ");
    }

    public Student(int studentId, String studentName, char studentGrade) {
        System.out.println("this is student contructor with all 3 param");
    }

    public static void main(String[] args) {
        new Student();
    }

}
