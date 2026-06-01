package JavaTraining.Functions;

public class Browser {
    public boolean launchBrowser(String browserName){
        System.out.println("Checking the browser : " + browserName);
        if (browserName.equals("chrome")) {
            System.out.println("launch Chrome Browser");
            return true;
        } else if (browserName.equals("firefox")) {
            System.out.println("Launch FireFox Browser");
            return true;
        } else if (browserName.equals("edge")) {
            System.out.println("Launch a Edge Browser");
            return true;
        }else {
            System.out.println("Please enter a valid browser");
            return false;
        }
    }

    public static void main(String[] args) {
        Browser browser = new Browser();
        boolean flag = browser.launchBrowser("chrome1");
        if (flag == true) {
            System.out.println("Enter the URL");
        }else {
            System.out.println("As Browser is not launch so can't enter url");
        }

    }


}
