package DesignPatterns.Practice.FactoryTestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DriverClient {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver dr = new ChromeDriver();
//        dr.get("https://www.baeldung.com/java-interface-naming-conventions");

        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver =  driverFactory.getDriver("firefox");
        driver.get("https://www.baeldung.com/java-interface-naming-conventions");
        Thread.sleep(0,5000);
        List<WebElement> elements = driver.findElements(By.tagName("href"));
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }
        System.out.println("This is count of "+elements);
        driver.close();
    }

}
