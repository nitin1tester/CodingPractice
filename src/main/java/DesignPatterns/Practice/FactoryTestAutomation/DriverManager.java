package DesignPatterns.Practice.FactoryTestAutomation;

import org.openqa.selenium.WebDriver;

public interface DriverManager {
    WebDriver createDriver(String browser);
}
