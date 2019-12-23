package SeleniumMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//Implicitly wait:This wait tells webdriver to wait if the element is not available immidiately and
		//webdriver waits until the element is visible in specific time
		//implicitly wait didn't work in this page.Because,  Title is not a webelement. Implicitly wait just work for the webelement
		//if could not find webelement in specific time it will throw an exception like NoSuchElementException
		//You can only apply to webelement other
		// if it gives timeoutexception, it exactly means you have to use wait concept
		
		driver.get("https://app.hubspot.com/login");
		System.out.println(driver.getTitle());
		
		//Eger biz nosuchelementexp aldiysak once locator lari kontrol ederiz, sonrasinda wait conceptleriyle kontrol ederiz. 
				//Istersek her test edecegimiz kisimdan once yazabiliriz sikinti olmaz
			}
	}


