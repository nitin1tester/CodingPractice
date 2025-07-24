package DesignPatterns.Practice.FactoryVehicle;

public class Truck implements Vehicle{
    String fuelType;
    int speed;
    @Override
    public void drive(String truckFuel, int truckSpeed) {
        System.out.println("Drive a Truck " +truckFuel + " & " + truckSpeed);
    }
}
