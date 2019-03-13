package testcases;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_UserLogin extends CommonAPI {

//    String expectedLoginMessage = "Hey, testuser1";
//    String actualLoginMessage = driver.findElement(By.xpath("//*[@id='userarea']/ul/li[1]/b")).getText();

    @Test
    public void usrLogin() {
//        enterUserName("input_text", "testuser1");
//        enterPassword("input_password", "abcd1234");
//        clickLoginButton("button_submit");
        login();
        String expectedLoginMessage = "Hey, testuser1";
        String actualLoginMessage = driver.findElement(By.xpath("//*[@id='userarea']/ul/li[1]/b")).getText();

        Assert.assertEquals(expectedLoginMessage, actualLoginMessage);
    }
}
