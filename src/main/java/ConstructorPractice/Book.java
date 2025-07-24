package ConstructorPractice;

public class Book {

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

    private String title;
    private String author;
    private float price;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book("physice","Nitin Rastogi");
        System.out.println("This is Book " +book1.getTitle() +" written by " + book1.getAuthor());

        Book book2 = new Book("math","Mukesh",20.00f);
        System.out.println("This is Book " +book2.getTitle() +" written by " + book2.getAuthor() + " at Price "+ book2.getPrice());
    }



}
