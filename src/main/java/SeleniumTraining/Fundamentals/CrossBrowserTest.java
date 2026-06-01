package SeleniumTraining.Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
    WebDriver driver;
    String browser = "chrome";
    public WebDriver crossBrowser(String browser ){
        switch (browser){
            case "chrome": return new ChromeDriver();
            case "firefox": return new FirefoxDriver();
            case "safari" : return new SafariDriver();
            default: System.out.println("Please enter a valid browser " + browser);
            throw new RuntimeException("invalid Browser");
        }
    }
    public static void main(String[] args) {
        CrossBrowserTest ct = new CrossBrowserTest();
        WebDriver driver1 =  ct.crossBrowser("chrome");
        driver1.get("https://the-internet.herokuapp.com/");
        driver1.quit();
    }

}
