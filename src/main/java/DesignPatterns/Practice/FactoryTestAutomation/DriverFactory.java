package DesignPatterns.Practice.FactoryTestAutomation;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    public DriverManager dm;
    public WebDriver driver;
    public WebDriver getDriver(String browser ){
        if (browser.equalsIgnoreCase("chrome")) {
            dm = new ChromeDriverManager();
            return dm.createDriver(browser);
        } else if (browser.equalsIgnoreCase("firefox")) {
            dm = new FirefoxDriverManager();
            return dm.createDriver(browser);
        } else if (browser.equalsIgnoreCase("edge")) {
            dm = new EdgeDriverManager();
            return dm.createDriver(browser);
        }else {
            System.out.println("Please enter a valid browser");
        }
        return null;
    }
}
