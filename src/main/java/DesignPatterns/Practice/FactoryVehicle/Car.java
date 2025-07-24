package DesignPatterns.Practice.FactoryVehicle;

public class Car implements Vehicle {
    String fuelType;
    int speed;
    @Override
    public void drive(String carFuel, int carSpeed) {
        System.out.println("Drive a Car "+ carFuel + " & " + carSpeed );
    }
}
