package testcases;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_HomePageTitle extends CommonAPI {

    @Test
    public void homePageTitle(){
        login();
        String title = driver.getTitle();
        System.out.println("Home Page Title: " + title);
        Assert.assertEquals(title, "Forum of PeopleNTech - Index");
    }
}
