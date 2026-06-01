package JavaTraining.InheritanceConcept;

public class BMW extends Car {


    @Override
    public void start(){
        System.out.println("BMW - start");
    }
    @Override
    public void engine(){
        System.out.println("BMW - engine");
    }

    public void autoParking(){
        System.out.println("BMW Autoparking");
    }

    public static void billing(){
        System.out.println("BMW - billing ");
    }

    // private method
    private void getCarInfo(){
        System.out.println("BMW - info");
    }





}
