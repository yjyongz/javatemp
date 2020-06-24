package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.CustomListener.class)
public class ListenerTest {

    @Test
    void test1()
    {
        System.out.println("this is test1");
        Assert.assertEquals(1, 1);
    }

    @Test
    void test2()
    {
        System.out.println("this is test2");
        Assert.assertEquals(1, 2);
    }

    @Test
    void test3()
    {
        System.out.println("this is test3");
        throw new SkipException("this is skip exception");
    }
}
