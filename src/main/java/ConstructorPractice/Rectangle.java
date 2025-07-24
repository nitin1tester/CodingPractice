package ConstructorPractice;

public class Rectangle {

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle){
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 =  new Rectangle(4,5);
        System.out.println("This is Length " + rectangle1.getLength() + " This is width " + rectangle1.getWidth());

        Rectangle rectangle2 =  new Rectangle(rectangle1);
        System.out.println("This is Length " + rectangle2.getLength() + " This is width " + rectangle2.getWidth());
    }






}
