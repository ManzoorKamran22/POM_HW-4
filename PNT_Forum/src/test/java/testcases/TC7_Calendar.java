package testcases;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC7_Calendar extends CommonAPI {

    public void calendar(){
        login();
        buttonClickXpath("//*[@id='button_calendar']/a/span");
        String expectedCalendar = "March 2019";
        String actualCalendar = driver.findElement(By.xpath("//*[@id='bodyarea']/div[1]/ul/li[3]/a/span")).getText();
        Assert.assertEquals(actualCalendar, expectedCalendar);

    }
}
