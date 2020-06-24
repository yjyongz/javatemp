package pararelltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {


    @Test
    void logoTest() throws InterruptedException
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/mikema/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    void homePageTitle() throws InterruptedException
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/mikema/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(5000);
        driver.close();
    }

    @AfterMethod
    void tearDown()
    {
    }
}
