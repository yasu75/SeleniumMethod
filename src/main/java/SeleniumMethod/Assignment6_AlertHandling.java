package SeleniumMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_AlertHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
				
	
			driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	
			driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
			Thread.sleep(3000);
			
			
				
			driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
			Thread.sleep(3000);
			
				
			driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
			Thread.sleep(3000);
			
			driver.close();
	
			
			}
		
			
	}


	
	

