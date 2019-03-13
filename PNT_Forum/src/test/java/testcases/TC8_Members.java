package testcases;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC8_Members extends CommonAPI {

    public void members(){
        login();
        buttonClickXpath("//*[@id='button_mlist']/a/span");
        String expectedMember = "Members List";
        String actualMember = driver.findElement(By.xpath("//*[@id='bodyarea']/div[1]/ul/li[2]/a/span")).getText();
        Assert.assertEquals(actualMember, expectedMember);

    }
}
