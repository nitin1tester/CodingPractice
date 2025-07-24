package DesignPatterns.Practice.FactoryTestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager implements DriverManager{
    @Override
    public WebDriver createDriver(String browserFirefox) {
        return new FirefoxDriver();
    }
}
