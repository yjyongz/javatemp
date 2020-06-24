import org.testng.Assert;
import org.testng.annotations.Test;

/*
1.set up - open the browser application
2. login
3. close
 */
public class SecondTestCase {

    @Test(priority = 1)
    void setup() {
        System.out.println("opening brower");
    }

    @Test(priority = 3)
    void searchCustomer() {
        System.out.println("search customer");
        //Assert.assertEquals(1, 2);
    }

    @Test(priority = 2)
    void addCusomter() {
        System.out.println("add Customer");
    }

    @Test(priority = 4)
    void tearDown() {
        System.out.println("closing browser");
    }
}
