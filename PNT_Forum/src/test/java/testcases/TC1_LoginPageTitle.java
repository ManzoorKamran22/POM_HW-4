package testcases;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_LoginPageTitle extends CommonAPI {

    @Test
    public void loginPageTitle(){
        String title = driver.getTitle();
        System.out.println("Login Page Title: " + title);
        Assert.assertEquals(title, "Login");
    }
}
