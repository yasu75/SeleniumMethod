package SeleniumMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynWaitImplicitlyWaitConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//This method tells webdriver to wait if the element is not available immidiately,
		//and webdriver waits till the element is visiable in specified time.
		//If not it throws an exception like NoSuchElementException

		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//implicitly wait will apply on any element
		//You can only  apply to webelement otherwise it does not work
		
		
		driver.get("https://app.hubspot.com/login");
		//static wait
		//it is used to slow down element or threads
		//Thread.sleep(5000);
		
		//Implicitly wait does not work in this case, because title is not a webelement
		System.out.println("Title: "+ driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("yaseminyenipazar@gmail.com");
		
	}

}


