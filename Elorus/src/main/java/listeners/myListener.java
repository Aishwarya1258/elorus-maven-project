package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generic.basetest;

public class myListener implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		String failedScriptName = result.getMethod().getMethodName();
		basetest.actionUtil.capturescreenshot(failedScriptName);
	}
}
