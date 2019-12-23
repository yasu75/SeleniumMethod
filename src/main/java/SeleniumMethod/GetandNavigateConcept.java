package SeleniumMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandNavigateConcept {

	public static void main(String[] args) {
		//set property
				System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
				
				//launch browser
				WebDriver driver = new ChromeDriver();
						
				//enter URL/both of them do samething
				//driver.get("https://www.amazon.com/");	//get navigate to webpage 
				driver.navigate().to("https://www.amazon.com/");
				
				//get waits for the page to load fully and completely
				//Navigate will navigate to URL and does not wait to load fully and completely.
					//Nav is faster than get, because it does not wait
					//Nav has several methods like forward like, back and fresh
	}


}


