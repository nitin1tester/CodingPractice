package SeleniumTraining.Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasic {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        String str = driver.getTitle();
        System.out.println("Title of the page : " + str);
        driver.quit();


    }

}
