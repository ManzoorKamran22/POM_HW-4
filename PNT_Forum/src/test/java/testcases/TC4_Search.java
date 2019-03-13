package testcases;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC4_Search extends CommonAPI {

    public void search(){
        login();
        enterText("inputbox", "UFT Automation");
        String actualSearchResult = driver.findElement(By.xpath("//*[@id=\"bodyarea\"]/div[2]/h3/span[2]/text()")).getText();
        String expectedSearchResult = "Search results for: UFT Automation";
        Assert.assertEquals(actualSearchResult, expectedSearchResult);
    }
}
