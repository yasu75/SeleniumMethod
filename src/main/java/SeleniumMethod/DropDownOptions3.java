package SeleniumMethod;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptions3 {
	
static WebDriver driver;
	
	public static void main(String[] args) {
		
		//writing all values
		
		System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		By day =By.id("day");
		By month =By.id("month");
		By year =By.id("year");
		
		getAlloptions(driver,day);
	}
	public static void getAlloptions(WebDriver driver,By locator){
		
		WebElement element=getElement(driver, locator);
		Select select =new Select(element);
		
		List<WebElement> dropDownOptions=select.getOptions();//to take all available options from the web page
		System.out.println(dropDownOptions.size());
		
		for(int i=0;i<dropDownOptions.size();i++){
			String text = dropDownOptions.get(i).getText();
			System.out.println(text);
			
		}
		
	}
	public static WebElement getElement(WebDriver driver, By locator){
		
		WebElement element=driver.findElement(locator);
		return element;
			
		
	}

}
