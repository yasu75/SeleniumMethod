package SeleniumMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynWaitExpWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		
		//Thread.sleep(5000);
		
		//Explicitly wait: it works with webelement and non-web element
		//it is available webDriverWait interface
		//Explicitly wait will be applied with non-webelement and webelement
		
		//Explicitly wait: for non-webelement
		WebDriverWait wait= new WebDriverWait(driver,15);//if you don't set enaugh time(less then 5 second for this page), it gives TimeOutException
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		System.out.println("Title: "+ driver.getTitle());
		//Explicitly wait: for webelement
		//NoSuchElementException
		//driver.findElement(By.id("username")).sendKeys("yaseminyenipazar@gmail.com");
		
		//WebElement email=driver.findElement(By.id("username"));
		//wait.until(ExpectedConditions.visibilityOf(email));
		
		By email=By.id("username");
	//	wait.until(ExpectedConditions.presenceOfElementLocated(email));
	//	driver.findElement(email).sendKeys("yaseminyenipazar@gmail.com");
		By password =By.id("password");
		By loginBtn=By.id("loginBtn");
		By header=By.className("private-page__title");
		
		getElement(driver,email,3).sendKeys("yaseminyenipazar@gmail.com");
		getElement(driver,password,1).sendKeys("Azra2Berk1");
		getElement(driver,loginBtn,2).click();
		
		String text=getElement(driver,header,Util.DEFAULT_EXP_WAIT).getText();
		System.out.println(text);
		if(text.equals("Sales Dashboard")){
			System.out.println("Title is correct");
		}else{
			System.out.println("Title is incorrect");
		}
	}
	
	public static WebElement getElement(WebDriver driver,By locator,int timeout){
		waitForPresenceOfElement(driver,locator,timeout);
		WebElement element=driver.findElement(locator);
		return element;
	}
	public static void waitForPresenceOfElement(WebDriver driver,By locator, int timeout){
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
