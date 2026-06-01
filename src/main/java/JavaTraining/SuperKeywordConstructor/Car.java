package JavaTraining.SuperKeywordConstructor;

public class Car {

    String name;
    int price;

    public Car(){
        System.out.println("Default const...");
    }
    public Car(String name, int price){
        System.out.println("Car -- const....");
        this.name = name;
        this.price = price;
    }

}
