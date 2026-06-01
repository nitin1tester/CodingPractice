package JavaTraining.InheritanceConcept;

public class CarTest {

    public static void main(String[] args) {

        BMW bmw = new BMW();
        bmw.start(); // coming from child & overridden method
        bmw.stop(); // coming from parent
        bmw.refuel(); // coming from parent
        bmw.autoParking(); // coming from child
        bmw.engine();// coming from Grandparent
        bmw.increaseSpeed();// coming from parent & can't be overide as it's a final method.

        System.out.println("------------------------------");

        Audi audi = new Audi();

        audi.start();
        audi.refuel();
        audi.stop();
        audi.theftSafty();
        audi.engine(); // coming from grandparent

        System.out.println("------------------------------");

        Car car = new Car();
        car.start();
        car.stop();
        car.refuel();
        car.engine(); // coming from parent

        System.out.println("------------------------------");
        Truck truck = new Truck();
        truck.loading();



        System.out.println("------------------------------");
        // Top - Casting
        Car car1 = new BMW();
        car1.start();
        car1.refuel();
        car1.stop();
        car1.engine();

        System.out.println("------------------------------");
        // Top Casting
        Vechile vechile = new BMW();
        vechile.engine();

        System.out.println("------------------------------");
        // Down Casting






    }

}
