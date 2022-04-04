package testOptions;

import org.testng.*;
import utils.*;

public class testngListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("HOORRAAYYY! :D");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        String fileName = ScreenshotUtil.takeScreenshot();
        System.out.println("SAAADDD :(");
        System.out.println("Error Screenshot saved at " + fileName);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
    }
}
