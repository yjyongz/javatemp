package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

   @Override
   public void onTestStart(ITestResult result) {
      System.out.println("Starts onTestStart execution ..." + result.getName());
   }

   @Override
   public void onTestSuccess(ITestResult result) {
      System.out.println("Starts onTestSuccess execution ..." + result.getName());

   }

   @Override
   public void onTestFailure(ITestResult result) {
      System.out.println("Starts onTestFailure execution ..." + result.getName());
   }

   @Override
   public void onTestSkipped(ITestResult result) {
      System.out.println("Starts onTestSkipped execution ..." + result.getName());
   }

   @Override
   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

   }

   @Override
   public void onTestFailedWithTimeout(ITestResult result) {

   }

   @Override
   public void onStart(ITestContext context) {
       System.out.println("Starts onStart execution ..." + context.getName());
   }

   @Override
   public void onFinish(ITestContext context) {
      System.out.println("Finish onFinish execution ..." + context.getName());
   }
}
