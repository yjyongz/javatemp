import org.testng.Assert;
import org.testng.annotations.Test;

public class DependecyExample {

    @Test
    void startCar()
    {
        System.out.print("Car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.print("Car driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.print("Car stopped");
    }

    @Test(dependsOnMethods = {"stopCar", "driveCar"}, alwaysRun = true)
    void parkCar()
    {
        System.out.print("Car parked");
    }

}
