package JavaTraining.InheritanceConcept;

public class Car extends Vechile {

    public void start(){
        System.out.println("Car - start");
    }

    public void refuel(){
        System.out.println("Car - refuel");
    }

    public void stop(){
        System.out.println("Car - Stop ");
    }

    // Final method can not be overridden.
    public final void increaseSpeed(){
        System.out.println("Car - increaseSpeed");
    }

    // static method
    public static void billing(){
        System.out.println("Car - billing");
    }

    // private method can't be overidden.
    private void getCarInfo(){
        System.out.println("Car - info");
    }




}
