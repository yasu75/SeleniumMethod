package SeleniumMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptions1 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//writing all values
		
		System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");

		WebElement day=driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		
		Select select1=new Select(day);
		Select select2=new Select(month);
		Select select3=new Select(year);
		
		//List<WebElement> dayOptions=select1.getOptions();
		//		System.out.println(dayOptions.size());
				
		//for(int i=0;i<dayOptions.size();i++){
		//	String text = dayOptions.get(i).getText();
		//			System.out.println(text);
					
		//List<WebElement> monthOptions=select2.getOptions();
		//		System.out.println(monthOptions.size());
					
		//	for(int i=0;i<monthOptions.size();i++){
		//		String text = monthOptions.get(i).getText();
		//		System.out.println(text);			
					
		List<WebElement> yearOptions=select3.getOptions();
					System.out.println(yearOptions.size());
							
					for(int i=0;i<yearOptions.size();i++){
						String text = yearOptions.get(i).getText();
						System.out.println(text);			
									
		}
	}
}
