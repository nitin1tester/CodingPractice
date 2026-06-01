package JavaTraining.Constructors;

public class User {

    String name;
    int age;
    boolean isActive;
    double salary;

    public User(String name, int age, boolean isActive, double salary) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.salary = salary;
    }

    public User(String name, int age){
        this.name = name; // G=L
        this.age = age;// G=L

    }

    public User(String name, int age, double salary, boolean isActive){
        this.name = name; // G=L
        this.age = age;// G=L
        this.salary = salary;

    }

    public static void main(String[] args) {
        User u1 = new User("Nitin",30);
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.salary);
        System.out.println(u1.isActive);

        System.out.println("______________________________");

        User u2 = new User("Ram", 35, 25.00, true);
        System.out.println(u2.name);
        System.out.println(u2.age);
        System.out.println(u2.salary);
        System.out.println(u2.isActive);
    }
}
