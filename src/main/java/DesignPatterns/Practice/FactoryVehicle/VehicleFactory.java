package DesignPatterns.Practice.FactoryVehicle;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType){
        if (vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            return new Truck();
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            return new Bike();
        } else {
            System.out.println("Please enter a valid Vehicle");
        }
        return null;
    }
}
