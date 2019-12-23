package SeleniumMethod;
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandlingwithGeneric {
	static WebDriver driver;
	
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
				
				// Launch browser
				driver = new ChromeDriver();
				// enter URL
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				
				driver.findElement(By.name("proceed")).click();
				Thread.sleep(4000);
				
				getALertText();

				// Generic method : Reusability code
				// POM framework hybrid
				
			}
				public static String getALertText(){
					
					Alert alert = driver.switchTo().alert();
					String text = alert.getText();
					System.out.println(text);
					alert.accept();
					return text;
			}
		
	}


