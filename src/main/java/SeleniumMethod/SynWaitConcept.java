package SeleniumMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		//static wait
		//it is used to slow down element or threads
		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		
	}

}
