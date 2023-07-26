package learnselenium;

import org.testng.annotations.Test;

public class DependsOnFails {
    @Test(timeOut = 1000)
	public void method1() throws InterruptedException {
    	Thread.sleep(2000);
		System.out.println("method1");
	}
    @Test(dependsOnMethods = "method1",alwaysRun = true)
	public void method2() {
		System.out.println("method2");
	}
}
