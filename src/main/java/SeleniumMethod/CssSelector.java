package SeleniumMethod;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CssSelector {

		public static void main(String[] args) throws InterruptedException {
			//Set property
			System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
			
			//launch browser
			WebDriver driver = new ChromeDriver();
			
			//enter URL
			driver.get("https://app.hubspot.com/login");
			Thread.sleep(5000);
			
			//First
			//WebElement userElement=driver.findElement(By.cssSelector("#username"));
			//userElement.sendKeys("yaseminyenipazar@gmail.com");
			
			//second
			//driver.findElement(By.cssSelector("#username")).sendKeys("yaseminyenipazar@gmail.com");
			
			//Third
			By username=By.cssSelector("#username");
			//WebElement userElement=driver.findElement(username);
			//userElement.sendKeys("yaseminyenipazar@gmail.com");
			
			//Fourth
			Util.getElement(driver, username).sendKeys("yaseminyenipazar@gmail.com");
			
			//Css selector:only moves forward,does not move backward
			//it is faster than xpath
	}

}
