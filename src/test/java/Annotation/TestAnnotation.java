package Annotation;
import org.testng.annotations.Test;

//class seviyesinde @Ignore ilede testler calismayabilir
public class TestAnnotation {
	@Test(priority=0,enabled=false)	
	//or @Test(enabled=false)	
		public void aTest(){}
	@Test	
		public void cTest(){}
	@Test	
		public void bTest(){}
	
}
