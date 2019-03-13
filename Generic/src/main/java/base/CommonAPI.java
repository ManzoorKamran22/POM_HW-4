package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/ManzoorKamran/Documents/IntelliJ/WebAutomation/Generic/driver/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }


    //@Parameters({"userName"})
    public void enterUserName(String propClassName, String userName){
        driver.findElement(By.className(propClassName)).sendKeys(userName);
    }

    public void enterPassword(String propClassName, String userPassword){
        driver.findElement(By.className(propClassName)).sendKeys(userPassword);
    }

    public void clickLoginButton(String propClassName){
        driver.findElement(By.className(propClassName)).click();
    }

    public void enterText(String propClassName, String searchItem){
        driver.findElement(By.className(propClassName)).sendKeys(searchItem, Keys.ENTER);
    }

    public void buttonClickXpath(String propXpath){
        driver.findElement(By.className(propXpath)).click();
    }

    public void login(){
        enterUserName("input_text", "testuser1");
        enterPassword("input_password", "abcd1234");
        clickLoginButton("button_submit");
    }

    public void getPageSource(){
        System.out.println("Page Source: \n" + driver.getPageSource());
    }


}


