package JavaTraining.ExceptionHandling;

public class DriverFactory {

    public static void launchBrowser(String browserName ){
        System.out.println("launching the Browser : " + browserName);

        switch(browserName.trim().toLowerCase()){
            case "chrome":
                System.out.println("launch Chrome broser");
                break;
            case "firefox":
                System.out.println("launch firefox browser");
                break;
            case "edge":
                System.out.println("launch edge browser");
                break;
            case "safari":
                System.out.println("launch safari browser");
                break;
            default:
                System.out.println("Please enter a valid browser");
                throw new DataException(browserName+"is not found ");
        }
    }
    public static void main(String[] args) {
        launchBrowser("opera  ");
        System.out.println("Go to URL");
    }
}
