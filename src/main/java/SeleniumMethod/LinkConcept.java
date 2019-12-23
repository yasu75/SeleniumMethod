package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkConcept {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/Users/yaseminarslan/Downloads/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://app.hubspot.com/login");
	Thread.sleep(6000);
	By signUp=By.linkText("Sign up");
	
	//By signUp=By.partialLinkText("Sign");
	
	Util.getElement(driver, signUp).click();
	
	

	}

}
