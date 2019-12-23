package SeleniumMethod;

import org.testng.annotations.Test;

public class TestNGGroups {
	 @Test (groups = "Regression")
	    public void tc1(){
	        System.out.println("Executing testcase1 of testclass1..");
	    }
	    
	    @Test (groups = "Sanity")
	    public void tc2(){
	        System.out.println("Executing testcase2 of testclass1..");
	    }
	    
	    @Test (groups = "Regression")
	    public void tc3(){
	        System.out.println("Executing testcase3 of testclass1..");
	    }
	    
	    @Test (groups = "Sanity")
	    public void tc4(){
	        System.out.println("Executing testcase4 of testclass1..");
	    }
	}
	






