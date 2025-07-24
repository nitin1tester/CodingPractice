package ConstructorPractice;

public class Dog {

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }

    private String name;
    private int color;

    public Dog(String name, int color ){
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Gold", 3);
        System.out.println("This is name : "+ dog.getName());
        System.out.println("This is color : "+ dog.getColor());
    }


}
