package SeleniumTraining.Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        String source =  driver.getPageSource();
        System.out.println(source);
    }
}
