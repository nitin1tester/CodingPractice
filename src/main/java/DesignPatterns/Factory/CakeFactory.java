package DesignPatterns.Factory;

public class CakeFactory {

    public Cake getCakeShape(String CakeDesign){
        if (CakeDesign.equalsIgnoreCase("SQUARE")) {
            System.out.println("");
            return new SquareCake();
        } else if (CakeDesign.equalsIgnoreCase("ROUND")) {
            return new roundCake();
        } else {
            System.out.println(CakeDesign+" shape is not available !!!");
        }
        return null;
    }
}
