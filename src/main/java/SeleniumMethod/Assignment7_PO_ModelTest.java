package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment7_PO_ModelTest {

	
		public static WebDriver driver;
		
			
			static By username =By.id("username");
			static By password=By.id("password");
			static By login = By.className("fa-sign-in");
			
			
				public static void main(String[] args) throws InterruptedException {
					
					driver=Util.launchBrowser(driver, "chrome");
					Util.launchURL(driver, "http://the-internet.herokuapp.com/login");
					Thread.sleep(3000);
					
					
					Util.getElement(driver,username).sendKeys("yaseminyenipazar@gmail.com");
					Thread.sleep(3000);
					Util.getElement(driver, password).sendKeys("123456");
					Thread.sleep(3000);
					Util.getElement(driver, login).click();
					Thread.sleep(3000);

	}

}
