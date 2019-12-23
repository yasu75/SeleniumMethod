package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Remedial_ActionsClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/keyboard-events-sample-form/");
		
		Actions myAction=new Actions(driver);
		WebElement userName=driver.findElement(By.id("userName"));
		
		myAction.sendKeys(userName, "yasemin").perform();
		
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		myAction.click(currentAddress).sendKeys("AdanaLIYIM").perform();
		
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		
		myAction.keyDown(currentAddress,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		myAction.keyDown(Keys.CONTROL).sendKeys("c").keyUp(permanentAddress,Keys.CONTROL).perform();
		myAction.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	
	}

}
