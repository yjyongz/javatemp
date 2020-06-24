import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExamples {

    WebDriver driver;
    @BeforeClass
    void setup()
    {
       System.setProperty("webdriver.chrome.driver", "/Users/mikema/chromedriver/chromedriver");
       driver = new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Test(priority = 0)
    void logoTest()
    {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");
    }

    @Test(priority = 1)
    void homePageTitle()
    {
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "title is not matched");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
