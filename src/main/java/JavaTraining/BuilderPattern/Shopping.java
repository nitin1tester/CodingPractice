package JavaTraining.BuilderPattern;

public class Shopping {

    public Shopping login(){
        System.out.println("Login to app");
        return this;
    }
    public Shopping login(String username, String password){
        System.out.println("Login to app with " + username + " & " + password);
        return this;
    }
    public Shopping search(){
        System.out.println("default search");
        return this;
    }

    public Shopping search(String productName){
        System.out.println("Search with " + productName );
        return this;
    }

    public Shopping search(String productName , int price){
        System.out.println("Search with " + productName + " & " + price);
        return this;
    }

    public Shopping addToCart(String productName){
        System.out.println("Add to cart: " + productName );
        return this;
    }

    public Shopping makePayment(String upi){
        System.out.println("Make payment with " + upi );
        return this;
    }

    public Shopping makePayment(String userId , String password){
        System.out.println("Make payment with " + userId + " & " + password );
        return this;
    }

    public Shopping makePayment(String cc, int cvv){
        System.out.println("Make payment with " + cc + " & " + cvv );
        return this;
    }

    public Shopping genrateOrderId(){
        System.out.println("Your order id is : " + 121212);
        return this;
    }

    public Shopping logout(){
        System.out.println("Logout from amazon");
        return this;

    }


}
