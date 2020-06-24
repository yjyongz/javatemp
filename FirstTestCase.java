import org.testng.annotations.Test;

/*
1.set up - open the browser application
2. login
3. close
 */
public class FirstTestCase {

    @Test(priority = 1)
    void setup()
    {
        System.out.println("this is a set up test");
    }

    @Test(priority = 2)
    void login()
    {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void tearDown()
    {
        System.out.println("closing browser");
    }
}
