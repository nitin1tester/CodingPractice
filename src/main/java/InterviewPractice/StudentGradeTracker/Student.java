package InterviewPractice.StudentGradeTracker;

public class Student {

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    private String name;
    private Integer rollNumber;
    private String subject;
    private Integer marks;

    public String getName() {
        return name;
    }

    Student(String name, Integer rollNumber, String subject, Integer marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.subject = subject;
        this.marks = marks;
    }
}