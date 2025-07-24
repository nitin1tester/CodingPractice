package DesignPatterns.Practice.FactoryVehicle;

public class ClientVehicleFactory {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle v1= vehicleFactory.getVehicle("car");
        v1.drive("CNG",120);
        Vehicle v2= vehicleFactory.getVehicle("truck");
        v2.drive("Electric",300);
        Vehicle v3= vehicleFactory.getVehicle("bike");
        v3.drive("Petrol",100);
    }

}
