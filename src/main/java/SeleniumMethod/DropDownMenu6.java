package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu6 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		WebElement dayElement=driver.findElement(By.id("day"));
		WebElement monthElement=driver.findElement(By.id("month"));
		WebElement yearElement=driver.findElement(By.id("year"));
		
		Select select1=new Select(dayElement);
		System.out.println(select1.isMultiple());//boolean, it returns true or false===dropdown is single or multiple
		select1.deselectByIndex(3);
		//select1.deselectByVisibleText("day");
		
	}

}
