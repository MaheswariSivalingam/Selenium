package learnselenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {
		int failcount=0;
		int limit=3;
		if(failcount>limit) {
			failcount++;
			return true;
		}
	
		return false;
	}
}