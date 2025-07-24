package InterviewPractice.DepartmentSalaryAnalysis;

public class Employee {

    private String name;
    private String empRole;
    private String department;
    private double salary;

    public Employee(String name, String empRole, String department, double salary) {
        this.name = name;
        this.empRole = empRole;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpId(String empRole) {
        this.empRole = empRole;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
