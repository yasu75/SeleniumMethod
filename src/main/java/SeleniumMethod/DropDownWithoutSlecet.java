package SeleniumMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSlecet {

	public static void main(String[] args) {
		//Interview question:how to select an element without select class
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		List<WebElement>dayList=driver.findElements(By.xpath("//select[@id='day']/option"));
		
		System.out.println(dayList.size());
		
		//I want to select just only one value
	for(int i=0;i<dayList.size();i++){
			System.out.println(dayList.get(i).getText());
			String text=dayList.get(i).getText();
			if(text.equals("10")){
			dayList.get(i).click();
				break;
			}
		}
	}

}
