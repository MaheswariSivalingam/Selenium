package learnselenium;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {
@Test
	public void assertTest() {
		//hard assertion
		System.out.println("before assertion");
		//Assert.fail();
		Assert.assertEquals(true, false);
		System.out.println("after assertion");
	}
@Test
public void verify() {
	//soft assert
	SoftAssert assert1 = new SoftAssert();
	System.out.println("before assertion");
	assert1.assertEquals(true, false);
	System.out.println("after assertion");
}
}
