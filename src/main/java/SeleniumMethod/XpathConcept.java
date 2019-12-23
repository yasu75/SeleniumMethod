package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcept {

	public static void main(String[] args) throws InterruptedException {
		//Xpath: it is used to find location of any element on a wen page using HTML structure
		//twotypes 1-Absolute(/)and 2-relative(//)
		
	//  //tagname[@attributeName='value']syntax in xpath and all the way to element
		//chropath den al-hoca derste aldi
	//Relative starts with double slash(//),starting selection matching anywhere in the document
		// //input[@id='password']
		
	//Css and xpath difference
		//Css is faster thanxpath
		//xpath can traverse both forward and backford,but css only forward
		//Css is more understandable readable
		//xpath is complex and make hard to read
		
				//Set property
				System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
				
				//launch browser
				WebDriver driver = new ChromeDriver();
				
				//enter URL
				driver.get("https://app.hubspot.com/login");
				Thread.sleep(5000);
				
				//first
				//WebElement userElement=driver.findElement(By.xpath("//*[@id='username']"));
				//userElement.sendKeys("yaseminyenipazar@gmail.com");
				//second
				//driver.findElement(By.xpath(""//*[@id='username']")).sendKeys("yaseminyenipazar@gmail.com");
				
				//Third
				By username=By.xpath("//*[@id='username']");
				//WebElement userElement=driver.findElement(username);
				//userElement.sendKeys("yaseminyenipazar@gmail.com");
				
				//Fourth
				//Util
			
				Util.getElement(driver, username).sendKeys("yaseminyenipazar@gmail.com");
				
		
	}

}
