package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptUtilTest {
	

	public static void main(String[]args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		String title=JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		
		WebElement element=driver.findElement(By.linkText("Sign up"));
		
	//JavaScriptUtil.clickElementByJS(element, driver);
	//	JavaScriptUtil.refreshBrowserByJS(driver);
		
		//Generate alert method
		
		//JavaScriptUtil.generateAlert(driver, "This is search page");
		
		//Draw Border method
		//JavaScriptUtil.drawBorder(element, driver);
		
		//SendKeys method
		//JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "yasemin@gmail.com");
		//JavaScriptUtil.sendKeysUsingJSWithID(driver, "password", "123456");
		//String text=JavaScriptUtil.getBrowserInfo(driver);
		//System.out.println(text);
		
		//get page text
//		String textInner=JavaScriptUtil.getPageInnerText(driver);
//		System.out.println(textInner);
//		
//		//flash method
		WebElement username=driver.findElement(By.id("username"));
//		WebElement password=driver.findElement(By.id("password"));
//		WebElement loginButton=driver.findElement(By.id("loginBtn"));
//		
//		JavaScriptUtil.flash(username, driver);
//		username.sendKeys("yasemin@gmail");
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("123456");
//		JavaScriptUtil.flash(loginButton, driver);
//		loginButton.click();
		
		//Scroll down
		//driver.get("https://darksky.net/");
		//JavaScriptUtil.scrollPageDown(driver);
		
		//Change color
		JavaScriptUtil.changeColor("blue", username, driver);
		
		
}
}