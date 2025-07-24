package DesignPatterns.Practice.FactoryVehicle;

public class Bike implements Vehicle{
    String fuelType;
    int speed;
    @Override
    public void drive(String bikeFuel, int bikeSpeed) {
        System.out.println("Drive a Bike "+ bikeFuel + " & " + bikeSpeed);
    }
}
