package testcases;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC6_MyMessages extends CommonAPI {

    public void myMessages(){
        login();
        buttonClickXpath("//*[@id='button_pm']/a/span");
        String expectedMessageFlag = "Personal Messages";
        String actualMessageFlag = driver.findElement(By.xpath("//*[@id='bodyarea']/div[1]/ul/li[2]/a/span")).getText();
        Assert.assertEquals(actualMessageFlag, expectedMessageFlag);
    }
}
