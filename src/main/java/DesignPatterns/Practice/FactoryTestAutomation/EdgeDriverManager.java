package DesignPatterns.Practice.FactoryTestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager implements DriverManager  {

    @Override
    public WebDriver createDriver(String driverEdge) {
        return new EdgeDriver();
    }
}
