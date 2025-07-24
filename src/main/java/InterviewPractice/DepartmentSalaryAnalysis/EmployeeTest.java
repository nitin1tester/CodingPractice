package InterviewPractice.DepartmentSalaryAnalysis;

import NestedClassPractice.University;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nitin","Quality Analyst", "Engineering",2000.00));
        employees.add(new Employee("Nitin", "Quality Analyst", "Engineering", 1000.00));
        employees.add(new Employee("Shraddha", "QA Lead", "Engineering", 6000.00));
        employees.add(new Employee("Mukesh", "Developer", "Engineering", 8000.00));
        employees.add(new Employee("Ravi", "HR Manager", "HR", 5000.00));
        employees.add(new Employee("Meena", "Recruiter", "HR", 400.00));
        employees.add(new Employee("Amit", "Sales Manager", "Sales", 5500.00));
        employees.add(new Employee("Suman", "Developer", "Engineering", 9000.00));
        employees.add(new Employee("Priya", "Finance Analyst", "Finance", 4800.00));
        employees.add(new Employee("Ramesh", "Sales Executive", "Sales", 3200.00));

        //Print names of employees with salary > 50,000
        employees.stream().filter(salary->salary.getSalary()>5000).map(name->name.getName()).forEach(System.out::println);

        //Calculate average salary in the company
        System.out.println(employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0));

        //Find the employee(s) with the highest salary
        Double maxSalary = employees.stream().mapToDouble(Employee::getSalary).max().orElse(0.0);
        employees.stream().filter(s -> s.getSalary() == maxSalary).map(name -> name.getName()).forEach(System.out::println);
        //Group employees by department and print names
        System.out.println(employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment, Collectors
                                .mapping(Employee::getName, Collectors.toList()))));
        //Print the names of employees whose name starts with “R”
        employees.stream().map(Employee::getName).filter(s->s.startsWith("R")).forEach(System.out::println);

        //Sort employees by salary in descending order and print their names
        System.out.println("Sort employees by salary in descending order and print their names");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getName).forEach(System.out::println);

        //Print the first 3 highest-paid employees
        System.out.println("Print the first 3 highest-paid employees");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).map(Employee::getName).forEach(System.out::println);

        //Calculate the total salary payout of the company
        System.out.println("Calculate the total salary payout of the company");
        System.out.println(employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum));

        //Find the minimum salary and print the employee(s) who earn it
        System.out.println("Find the minimum salary and print the employee(s) who earn it");
        System.out.println(employees.stream().min(Comparator.comparing(Employee::getSalary)).map(Employee::getName));
        System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary)).findFirst().map(Employee::getName));

        //Count how many employees are in each department
        System.out.println("Count how many employees are in each department");
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));

        //Group employees by designation and print the count under each
        System.out.println("Group employees by designation and print the count under each");
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getEmpRole, Collectors.counting())));

        //Group employees by department and list all their salaries
        System.out.println("Group employees by department and list all their salaries");
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getSalary, Collectors.toSet()))));

        //Group employees by department and find the max salary in each
        System.out.println("Group employees by department and find the max salary in each");
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary)))));


    }

}
