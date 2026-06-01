package SeleniumPractice;

import edu.umd.cs.piccolo.util.PUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABTesting extends Base{

    @BeforeMethod
    public void gotoLink(){
        driver.get("https://the-internet.herokuapp.com/abtest");
    }

    @Test
    public void verifyABTestVariation(){
        List<String> list = Arrays.asList(
                "A/B Test Variation 1",
                "A/B Test Control"
        );
        WebElement heading = driver.findElement(By.tagName("h3"));
        String headText = heading.getText();
        System.out.println("This is heading text : " + headText );
        Assert.assertTrue(list.contains(headText),"UnExpected Result : " + headText);
    }

    @Test
    public void verifyPageLoadsSuccessfully(){
        boolean flag = driver.getCurrentUrl().contains("abtest");
        Assert.assertTrue(flag);
    }


}
