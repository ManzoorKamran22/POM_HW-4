package testcases;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC9_Logout extends CommonAPI {

    public void logout(){
        login();
        buttonClickXpath("//*[@id='button_logout']/a/span");
        Assert.assertTrue(driver.findElement(By.className("button_submit")).isDisplayed());
    }
}
