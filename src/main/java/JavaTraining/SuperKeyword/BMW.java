package JavaTraining.SuperKeyword;

public class BMW extends Car{
    int speed = 200;
    @Override
    public void start(){
        super.start();
        System.out.println("BMW-Start");
    }

    public void displaySpeed(){
        System.out.println(speed); //200
        System.out.println(super.speed); //100
    }
    //method billing
    public static void billing(){
        System.out.println("BMW -- Billing");
    }
}
