package SeleniumMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlUnitDriverHeadless {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/htmlunit-driver -->
		<dependency>
    		<groupId>org.seleniumhq.selenium</groupId>
    		<artifactId>htmlunit-driver</artifactId>
    		<version>2.36.0</version>
		</dependency>

		 */
		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new HtmlUnitDriver();	
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
