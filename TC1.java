import org.testng.annotations.*;

public class TC1 {

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
    void test1()
    {
        System.out.println("this is test1...");
    }

    @Test
    void test2()
    {
        System.out.println("this is test2...");
    }

    @BeforeTest
    void beforeTest()
    {
        System.out.println("this will execute before the Test");
    }

    @AfterTest
    void AfterTest()
    {
        System.out.println("this will execute After the Test");
    }
}
