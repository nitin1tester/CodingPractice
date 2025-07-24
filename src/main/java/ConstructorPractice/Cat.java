package ConstructorPractice;

public class Cat {

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    public Cat(){
        this.name = "unknown";
        this.age = 0;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("this is name "+ cat.getName());
        System.out.println("this is age "+ cat.getAge());
    }


}
