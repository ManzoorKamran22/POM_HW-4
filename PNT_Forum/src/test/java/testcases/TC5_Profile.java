package testcases;

import base.CommonAPI;
import org.testng.Assert;

public class TC5_Profile extends CommonAPI {

    public void profile(){
        login();
        buttonClickXpath("//*[@id='button_profile']/a/span");
        String expectedPageTitle = "Profile of tesruser1";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
    }
}
