package SeleniumMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPractice1 {
	
	    public WebDriver driver;
	    
	    @Test
	    public void testKeys_Chord() throws Exception {
	        driver.get("https://accounts.google.com/signup");
	        WebElement txtFName=driver.findElement(By.name("firstName"));
	        WebElement txtLName=driver.findElement(By.name("lastName"));
	        txtFName.sendKeys("webdriver");
	        Actions a = new Actions(driver);
	        a.sendKeys(txtFName, Keys.chord(Keys.CONTROL,"a")).perform();
	        a.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
	        a.sendKeys(txtLName, Keys.chord(Keys.CONTROL,"v")).perform();
	        Thread.sleep(2000);
	    }
	    
	    @BeforeClass
	    public void beforeClass() {
	        WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
	       
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    
	    @AfterClass
	   public void afterClass() throws Exception {
	    //    driver.quit();
	    }
}















