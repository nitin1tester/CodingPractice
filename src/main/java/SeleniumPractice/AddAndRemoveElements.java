package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddAndRemoveElements extends Base {

    @BeforeMethod
    public void gotoUrl(){
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }
    @Test
    public void verifyAddElementButtonWorks(){
        WebElement addElementBtn = driver.findElement(By.xpath("//button[contains(normalize-space(),'Add Element')]"));
        addElementBtn.click();
        WebElement deleteElementBtn = driver.findElement(By.xpath("//button[normalize-space()='Delete']"));
        boolean flag = deleteElementBtn.isDisplayed();
        Assert.assertTrue(flag);
    }


}
