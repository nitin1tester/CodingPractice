package NestedClassPractice;

public class Car {

    public void startEngine(){
        System.out.println("Lets start Engine");
        class Engine{
            public void run(){
                System.out.println("Engine is running");
            }
        }
        Engine engine = new Engine();
        engine.run();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
    }

}
