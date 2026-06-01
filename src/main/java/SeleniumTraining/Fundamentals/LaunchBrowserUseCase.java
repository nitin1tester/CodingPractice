package SeleniumTraining.Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserUseCase {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.quit();
    }

}
