package JavaTraining.SuperKeywordConstructor;

public class BMW extends Car {
    public BMW(){
        System.out.println("BMW - const...");
    }

    public BMW(int a){
        System.out.println("BMW with one param const..." + a);
    }

    public BMW(String str,int a){
        super(str,a);
        System.out.println("BMW with one param const..." + a);
    }
}
