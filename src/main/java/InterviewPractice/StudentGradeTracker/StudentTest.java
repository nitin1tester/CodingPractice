package InterviewPractice.StudentGradeTracker;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Nitin Rastogi",1,"Math",99));
        student.add(new Student("Shraddha Rastogi",2,"Math",100));
        student.add(new Student("Mukesh Rastogi",3,"Physic",75));
        student.add(new Student("Ram Rastogi",4,"Math",78));
        student.add(new Student("Shayam Rastogi",5,"Computer",50));
        student.stream().filter(a->a.getMarks()>75).map(s->s.getName().toUpperCase()).forEach(System.out::println) ;
        System.out.println(student.stream().mapToInt(Student::getMarks).average().orElse(0.0));
        int MaxMarks = student.stream().mapToInt(Student::getMarks).max().orElse(0);
        student.stream().filter(m->m.getMarks()== MaxMarks).map(s->s.getName()).forEach(System.out::println);


    }

}
