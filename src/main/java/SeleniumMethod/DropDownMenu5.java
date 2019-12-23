package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu5 {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		By day =By.id("day");
		By month =By.id("month");
		By year =By.id("year");
				
		selectDropDownValueByIndex(driver,day,9);
		selectDropDownValueByIndex(driver,month,9);
		selectDropDownValueByIndex(driver,year,9);
		
		WebElement dayElement=driver.findElement(By.id("day"));
		WebElement monthElement=driver.findElement(By.id("month"));
		WebElement yearElement=driver.findElement(By.id("year"));
		
		
	}
	public static void selectDropDownValueByIndex(WebDriver driver, By locator, int value){
		
		WebElement element= getElement(driver,locator);
		Select select=new Select(element);
		
	}
	public static WebElement getElement(WebDriver driver, By locator){//4.way
		
		WebElement element=driver.findElement(locator);
		return element;
	}
}
