package SeleniumMethod;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWaitConcept {
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//It works with webelement and non element
		//it is available in WebDriverWait class
		
		//ExpWait is working in 2 steps 
		WebDriverWait wait=new WebDriverWait(driver,15);//1.step is for defining a time 
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));//2.step is giving condition
		
		//Thread.sleep(5000);
		
		System.out.println("Title is : "+driver.getTitle());
		
		//driver.findElement(By.id("username")).sendKeys("Yasemin");
		
		By email=By.id("username");
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		driver.findElement(email).sendKeys("Yasemin");
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
	}

}
