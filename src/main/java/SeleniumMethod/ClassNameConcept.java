package SeleniumMethod;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameConcept {

	public static void main(String[] args) throws InterruptedException {
		//Set property
				System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
				
				//launch browser
				WebDriver driver = new ChromeDriver();
				
				//enter URL
				driver.get("https://app.hubspot.com/login");
				Thread.sleep(5000);
				
				//First   
				//form-control private-form__control login-email--html den class i kopyaladigimizda bu gelir. herbir bosluk bir class tir 
				//en son class concept icin kullaniriz
				
				//WebElement userElement =driver.findElement(By.className("login-email"));
				//userElement.sendKeys("yaseminyenipazar@gmail.com");
				
				//Second
				//driver.findElement(By.className("login-email")).sendKeys("yaseminyenipazar@gmail.com");
				
				//Third
				By username=By.className("login-email");
				//WebElement userElement=driver.findElement(username);
				//userElement.sendKeys("yaseminyenipazar@gmail.com");
				
				//Util
				Util.getElement(driver, username).sendKeys("yaseminyenipazar@gmail.com");
				

	}

}


	


