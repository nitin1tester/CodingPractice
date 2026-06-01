package JavaTraining.SuperKeyword;

import JavaTraining.InheritanceConcept.Vechile;

public class Car extends Vehicle {

    int speed = 100;

    public void start(){
        super.start();
        System.out.println("Car-Start");
    }

    public void stop(){
        System.out.println("Car-Stop");
    }
    // static method
    public static void billing(){
        System.out.println("Car - billing");
    }

    public void displayVehicleSpeed(){
        System.out.println(super.speed);
    }
}
