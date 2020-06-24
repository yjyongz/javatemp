import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass()
    {
        System.out.println("this will execute before the class");
    }

    @AfterClass
    void afterClass()
    {
        System.out.println("this will execute after the class");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will execute after every method");
    }

    @Test
    void test3()
    {
        System.out.println("this is test3...");
    }

    @Test
    void test4()
    {
        System.out.println("this is test4...");
    }

    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("this will execute before the suite");
    }

    @AfterSuite
    void afterSuite()
    {
        System.out.println("this will execute after the suite");
    }
}
