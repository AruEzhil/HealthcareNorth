package listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import commonfunction.Baseclass;

public class ListnerClass extends Baseclass implements ITestListener{
	private int m_count = 0;
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		log( "--Test method started\n");
		
	}

	private void log(String string) {
	      System.out.print(string);
	      if (++m_count % 40 == 0) {
	         System.out.println("");
	      }}
		
	

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		try {
			
			failed(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
