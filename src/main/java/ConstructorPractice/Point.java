package ConstructorPractice;

public class Point {

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y){
        this.x = (int)x;
        this.y = (int)y;
    }

    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println("X: " + point.x + " Y: " + point.y);

        Point point1 = new Point(2.4,3.9);
        System.out.println("X: " + point1.x + " Y: " + point1.y);

    }






}
