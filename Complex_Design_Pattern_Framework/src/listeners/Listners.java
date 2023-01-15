package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listners extends TestListenerAdapter {
	
@Override
public void onTestStart(ITestResult tr) {
	System.out.println("Test Started");
}

@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("test passed");
	}

@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("test failed");
	}

@Override
	public void onTestSkipped(ITestResult tr) {
	System.out.println("test skipped");
	}
}
