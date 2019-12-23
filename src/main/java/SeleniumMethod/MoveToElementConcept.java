package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		 //http://mrbool.com/how-to-creat-menu-with-submenu-using-css-html/26146
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/how-to-creat-menu-with-submenu-using-css-html/26146");
		
		WebElement contentMenu=driver.findElement(By.className("menulink"));
		Actions action=new Actions(driver);
		action.moveToElement(contentMenu).build().perform();
		
		//WebElement courcesLink=driver.findElement(By.linkText("COURSES"));//1.way
		WebElement courcesLink=driver.findElement(By.xpath("//ul[@class='submenu']//a[contains(text(), 'Courses')]"));
		courcesLink.click();//first approch
		//action.click(courcesLink);
		
	}

}
