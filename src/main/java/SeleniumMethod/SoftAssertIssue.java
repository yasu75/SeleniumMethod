package SeleniumMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertIssue {
	SoftAssert softAssertion=new SoftAssert();//bunu methodun icine yazmaliyiz, sonucun yanlis olmasinin nedeni bu
	
	@Test
	void TestSoftAssertOne(){
		softAssertion.assertEquals("Hello", "Hello");
		softAssertion.assertTrue("Hello".equals("hello"), "second failed");
		softAssertion.assertAll();
	}
	@Test
	void TestSoftAssertTwo(){
		softAssertion.assertTrue("Welcome".equals("welcome"));
		softAssertion.assertTrue("Helo".equals("Hello"));
		
	}
	
	

}
