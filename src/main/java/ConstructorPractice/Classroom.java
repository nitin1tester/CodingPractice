package ConstructorPractice;

public class Classroom {

    public String getClassName() {
        return className;
    }

    public String[] getStudents() {
        return students;
    }

    private String className;
    private String[] students;

    public Classroom(String className, String[] students){
        this.className = className;
        this.students = students;
    }

    public static void main(String[] args) {
        String[] stu = {"ram", "Nitin", "mohan"};
        Classroom classroom = new Classroom("Science", stu);
        System.out.println("Class Name :" + classroom.getClassName());
        System.out.print("Students : ");
        for(String stud : stu){
            System.out.print(stud);
            System.out.print(" ");
        }
    }
}
