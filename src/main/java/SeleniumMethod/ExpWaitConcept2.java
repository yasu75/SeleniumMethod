package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpWaitConcept2 {

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
		
		getElement(driver,email).sendKeys("yaseminyenipazar@gmail.com");
		getElement(driver,password).sendKeys("123456");
		getElement(driver,loginButton).click();
	}

	public static WebElement getElement(WebDriver driver,By locator){
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement element=driver.findElement(locator);
		return element;
		
	}
}
