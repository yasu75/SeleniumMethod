package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	
		public static WebDriver driver;
		
		static By firstName=By.name("firstName");
		static By lastName=By.name("lastName");
		static By phone=By.name("phone");
		static By email=By.id("userName");
		static By address=By.name("address1");
		static By city=By.name("city");
		static By state=By.name("state");
		static By postalCode=By.name("postalCode");
		static By userName=By.name("email");
		static By password=By.name("password");
		static By confirmPassword=By.name("confirmPassword");
		static By submitButton=By.name("submit");
		
		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/register.php");
			Thread.sleep(3000);
			
			WebElement country = driver.findElement(By.name("country"));
			Select select1 = new Select(country);
			
			
			
			Util.getElement(driver, firstName).sendKeys("Yasemin");
			Thread.sleep(2000);
			Util.getElement(driver,lastName).sendKeys("Arslan");
			Thread.sleep(2000);
			Util.getElement(driver,email).sendKeys("yaseminyenipazar@gmail.com");
			Thread.sleep(2000);
			Util.getElement(driver,address).sendKeys("5100 HighBridge Str 33F");
			Thread.sleep(2000);
			Util.getElement(driver,city).sendKeys("Syracuse");
			Thread.sleep(2000);
			Util.getElement(driver,state).sendKeys("NewYork");
			Thread.sleep(2000);
			Util.getElement(driver,postalCode).sendKeys("13066");
			Thread.sleep(2000);
			select1.selectByVisibleText("UNITED STATES");
			Thread.sleep(2000);
			Util.getElement(driver,userName).sendKeys("yyenipazar");
			Thread.sleep(2000);
			Util.getElement(driver,password).sendKeys("123456");
			Thread.sleep(2000);
			Util.getElement(driver,confirmPassword).sendKeys("123456");
			Thread.sleep(2000);
			Util.getElement(driver,submitButton).click();

			
			
			
		}
	
		
}


	


