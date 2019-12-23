package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpWaitConcept3 {

	public static void main(String[] args) {
		

	

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://app.hubspot.com/login");

WebDriverWait wait=new WebDriverWait(driver,15);
wait.until(ExpectedConditions.titleContains("HubSpot Login"));
System.out.println("Title is: "+driver.getTitle());

By email =By.id("username");
By password =By.id("password");
By loginButton =By.id("loginBtn");
By header =By.className("private-page__title");

getElement(driver,email,3).sendKeys("yaseminyenipazar@gmail.com");
getElement(driver,password,1).sendKeys("Azra2Berk1");
getElement(driver,loginButton,2).click();

String text=getElement(driver,header,2).getText();
System.out.println(text);

if(text.equals("Sales Dashboard")){
	System.out.println("Title is correct");
}else{
	System.out.println("Title is incorrect");
}
}

	
	public static WebElement getElement(WebDriver driver, By locator,int timeout){
		waitForPresenceOfElement(driver,locator,timeout);
		WebElement element=driver.findElement(locator);
		return element;
	}
	
	public static void waitForPresenceOfElement(WebDriver driver, By locator,int timeout){
		WebDriverWait wait= new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
}





