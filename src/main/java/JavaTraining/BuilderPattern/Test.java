package JavaTraining.BuilderPattern;

public class Test {

    public static void main(String[] args) {
        // Method chaining >> Builder pattern
        Shopping shop = new Shopping();
         shop.login().search().addToCart("my product").makePayment("@upi@okbank").genrateOrderId().logout();
    }

}
