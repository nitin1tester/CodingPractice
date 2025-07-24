package DesignPatterns.Singleton;

public class Pizza {
    private static Pizza instance;

    private Pizza(){
        System.out.println("Pizza machine is ready");
    }

    public static Pizza getInstance(){
        System.out.println(instance);
        if (instance == null) {
            instance = new Pizza();
        }
        return instance;
    }

    public void makePizza(String pizaaType){
        System.out.println("This is a " + pizaaType);
    }
}
