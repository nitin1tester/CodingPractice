package ConstructorPractice;

public class Car {

    public String getMake() {
        return make;
    }

    public String getModal() {
        return modal;
    }

    public int getYear() {
        return year;
    }

    private String modal;
    private int year;
    private String make;

    public Car(){
        this.make = "Tata";
        this.modal = "Altroz";
        this.year = 2021;
    }

    public Car(String make, String modal, int year){
        this.make = make;
        this.modal= modal;
        this.year = year;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("A "+car.getMake() + " modal is " + car.getModal() + " in year " + car.getYear() );

        Car car1 = new Car("hundai","Creta",2025);
        System.out.println("A "+car1.getMake() + " modal is " + car1.getModal() + " in year " + car1.getYear() );




    }

}
