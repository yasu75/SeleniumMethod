package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rangeslider.js.org/");
		WebElement slider =driver.findElement(By.xpath("//div[@id='js-rangeslider-0']//div[@class='rangeslider__handle']"));
		WebElement element = driver.findElement(By.id("js-rangeslider-0"));
		
		//how to find dimension
		Dimension dim=element.getSize();
		System.out.println(dim);//axis
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDropBy(slider,-100, 0).perform();
		
		actions.clickAndHold(slider).moveByOffset(40,0).release().perform();
	}

}
