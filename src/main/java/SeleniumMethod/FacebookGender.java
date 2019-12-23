package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookGender {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println("Line 16: "+driver.findElement(By.name("sex")).isSelected());
		
		driver.findElement(By.name("sex")).click();
		
		System.out.println("Line 20: "+driver.findElement(By.name("sex")).isSelected());

	}

}
