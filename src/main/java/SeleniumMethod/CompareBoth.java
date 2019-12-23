package SeleniumMethod;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CompareBoth {
	@Test
	void hardAssertOne(){
		
		Assert.assertEquals(5,5);
		Assert.assertTrue("Hello".equals("hello"));
	}
	
	@Test
	void softAssertOne(){
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue("Hello".equals("Hello"),"first soft assert failed");
		softAssert.assertEquals("Hello".equals("Hello"),"second soft assert failed");
	}

}
