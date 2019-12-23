package SeleniumMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotConcept2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//will be maximize
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.get("http://www.amazon.com");
		
		//Take screenshot from webpage
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Now copy the screenshot desired location using copyfile //method
		FileUtils.copyFile(src, new File("/Users/yaseminarslan/Desktop/TestPng/picture.png"));
		

	}

}

	


