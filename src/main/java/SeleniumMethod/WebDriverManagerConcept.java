package SeleniumMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");

	}

}

