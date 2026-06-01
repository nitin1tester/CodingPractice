package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;

public class BrokenImage extends Base {

    @BeforeMethod
    public void gotoUrl(){
        driver.get("https://the-internet.herokuapp.com/broken_images");
    }

    @Test
    public void verifyBrokenImage(){
        List<WebElement> webElements = driver.findElements(By.tagName("img"));
        for(WebElement element : webElements){
            String url = element.getAttribute("src");
            System.out.println("This is Url >> "+ url);
        }
    }


}
