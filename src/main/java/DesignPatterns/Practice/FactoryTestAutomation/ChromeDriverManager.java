package DesignPatterns.Practice.FactoryTestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager implements DriverManager {
    @Override
    public WebDriver createDriver(String browserChrome) {
        return new ChromeDriver();
    }
}
