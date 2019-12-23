package SeleniumMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemedialWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // CONSTANTS --SABIT
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.get("https://login.yahoo.com/");
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("yaseminyenipazar@gmail.com");
    
        // Clicking on the next button if element is located
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-username']")).clear();
	}

}
