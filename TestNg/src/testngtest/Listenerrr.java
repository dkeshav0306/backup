package testngtest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listenerrr implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	Reporter.log("start test ", true);	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test is Successfull", true );
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test is failed" ,true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test is skiped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	

}
