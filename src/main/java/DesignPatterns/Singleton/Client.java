package DesignPatterns.Singleton;

public class Client {

    public static void main(String[] args) {
        Pizza P1 = Pizza.getInstance();
        P1.makePizza("Round Pizza");
        Pizza P2 = Pizza.getInstance();
        P1.makePizza("Square Pizza");

        System.out.println(P1==P2);
    }

}
