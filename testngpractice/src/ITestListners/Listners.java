package ITestListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("onFinish of test cases and its details are : "+result.getName());  
	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
	
		System.out.println("onStart of test cases and its details are : "+result.getName());  
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Failure of test cases and its details are : "+result.getName());  
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Skip of test cases and its details are : "+result.getName());  	
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Success of test cases and its details are : "+result.getName());  
	}

}
