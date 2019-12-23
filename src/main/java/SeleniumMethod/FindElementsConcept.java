package SeleniumMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https:mail.rediff.com/cgi-bin/login.cgi");
		//driver.get("https:amazon.com");
		
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		//Size---how many link is available in webpage?
		System.out.println("Total links are: "+linklist.size());
		
		for(int i=0;i<linklist.size();i++){
			String text=linklist.get(i).getText();
			//System.out.println(text);
		
		//if(!text.isEmpty()){//linkler bossa secme
		//	System.out.println(text);
			
		//	}
			
			//go to link: forgot Password?
			//1.way
			//driver.findElement(By.linkText("Forgot Password?")).click();
			//2.way
			if(text.equals("Forgot Password?")){
				linklist.get(i).click();
				break;
			}
		
		}


	}

}
