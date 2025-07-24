package DesignPatterns.Factory;

public class Client {

    public static void main(String[] args) {
        CakeFactory cakeFactory = new CakeFactory();
        Cake cake1 = cakeFactory.getCakeShape("square");
        cake1.shape();
        Cake cake2 = cakeFactory.getCakeShape("Round");
        cake2.shape();
        Cake cake3 = cakeFactory.getCakeShape("Heart");
        cake3.shape();
    }
}
