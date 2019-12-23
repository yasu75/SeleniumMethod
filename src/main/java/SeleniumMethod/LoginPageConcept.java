package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPageConcept {

public static WebDriver driver;
	
	static By email=By.id("username");
	static By password =By.xpath("//*[@id='password']");
	static By loginButton=By.cssSelector("#loginBtn");
	

	public static void main(String[] args) throws InterruptedException {
		
		driver=Util.launchBrowser(driver, "chrome");
		Util.launchURL(driver,"https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		
		Util.getElement(driver, email).sendKeys("yaseminyenipazar@gmail.com");
		Util.getElement(driver,password).sendKeys("test123");
		Util.getElement(driver,loginButton).click();

	}

}

