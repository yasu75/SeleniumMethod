package HTMLforTestNG;

import org.testng.annotations.Test;

public class ScippingTests {
	@Test(priority = 0,groups={"b"})
    public void firstTest () {
        System.out.println("1st Test is Started.");
    }
    
    @Test (priority = 1, enabled = false,groups={"a"})
    public void secondTest () {
        System.out.println("2nd Test is Started.");
    }
    
    @Test (priority = 2,groups={"a","b"})
    public void thirdTest () {
        System.out.println("3rd Test is Started.");
    }
}

