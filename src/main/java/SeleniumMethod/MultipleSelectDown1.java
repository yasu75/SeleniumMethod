package SeleniumMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelectDown1 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		//click on function
		
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
		
		//List---I need to collect all values
		List<WebElement> dropList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(dropList.size());
		
		//print out
		for(int i=0;i<dropList.size();i++){
			String text=dropList.get(i).getText();
			System.out.println(text);
		//to ignore empty	
			if(!text.isEmpty()){
				dropList.get(i).click();
			}
		//it selects all choices until choice 6 2 1
			if(text.equals("choice 6 2 1")){
				dropList.get(i).click();
				break;
			}
		}
}
}
	