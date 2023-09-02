package learnselenium;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TimeOut {


@Test(timeOut=2000,expectedExceptions = ThreadTimeoutException.class)
//expectedExceptions testcase will show pass
	public void test() throws InterruptedException {
	Thread.sleep(3000);
		System.out.println("tom");
	}
}
