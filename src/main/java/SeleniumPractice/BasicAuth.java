package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuth extends Base {

    @Test
    public void verifyBasicAuth(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement element =  driver.findElement(By.xpath("//h3[normalize-space()='Basic Auth']"));
        String heading = element.getText();
        System.out.println("This is heading :" + heading);
        Assert.assertEquals(heading,"Basic Auth");
    }
}
