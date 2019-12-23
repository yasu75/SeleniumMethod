package SeleniumMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessConcept {

	public static void main(String[] args) {
		
		//Why do we use headless mode
		//it is without browser testing
		//we need to use sometimes jenkins,sometimes linux machine and we can not download the browser 
		//In this case you need to use headless mode
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		
		//chromedriver doesn't work
		WebDriver driver=new ChromeDriver(co);
		driver.get("http://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		
		
		
		
		
		
		
		
	}

}
