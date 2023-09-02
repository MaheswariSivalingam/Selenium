package learnselenium;

import org.testng.annotations.Test;

public class TestMultipleTimes {
@Test(invocationCount=4)
	public void test() {
		System.out.println("tom");
	}

}
