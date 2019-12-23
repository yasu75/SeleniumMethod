package SeleniumMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssortation {
	@Test
	public void softAssert(){
		SoftAssert softAssertion=new SoftAssert();
		
		System.out.println("softAssert() is started");
		softAssertion.assertTrue(false);
		System.out.println("softAssert() is executed");
	}

}

