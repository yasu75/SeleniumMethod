package SeleniumMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdConcept {

	public static void main(String[] args) throws InterruptedException {
		//Set property
				System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
				
				//launch browser
				WebDriver driver = new ChromeDriver();
				
				//enter URL
				driver.get("https://app.hubspot.com/login");
				Thread.sleep(5000);
				
				//ID id always unique
				
				//First usage
				//WebElement userElement=driver.findElement(By.id("username"));
				//userElement.sendKeys("yaseminyenipazar@gmail.com");
				
				//second usage
				//driver.findElement(By.id("username")).sendKeys("yaseminyenipazar@gmail.com");
				
				//Third usage---if we have just one test case , we can use this usage
				
			By username=By.id("username");
			//	WebElement userElement=driver.findElement(username);
			//	userElement.sendKeys("yaseminyenipazar@gmail.com");
				
				//Fourth usage--we have to prefer
				Util.getElement(driver, username).sendKeys("yaseminyenipazar@gmail.com");
				
	}

}


	
