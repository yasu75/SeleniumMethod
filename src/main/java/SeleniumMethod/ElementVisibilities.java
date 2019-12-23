package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVisibilities {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");
		WebElement submitButton=driver.findElement(By.id("submitButton"));
		
		System.out.println("Before submit button is enabled");
		System.out.println(submitButton.isDisplayed());
		System.out.println(submitButton.isEnabled());
		System.out.println("Line23 : "+driver.findElement(By.name("agreeTerms")).isSelected());
		
		driver.findElement(By.name("agreeTerms")).click();//select checkbox
		
		System.out.println("Line 27: "+driver.findElement(By.name("agreeTerms")).isSelected());
		
		System.out.println("After submit button is enabled");
		System.out.println(submitButton.isDisplayed());
		System.out.println(submitButton.isEnabled());
		
	}

}
