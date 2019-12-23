package SeleniumMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopup {

	public static void main(String[] args) {
		//it is called windows handling
		//getWindowHandle()-get the current window handle
		//getWindow Handles()-get the window handles that opened
		//switchTo().window()-switch focus between windows
				
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		System.out.println("Parent window is: "+parentWindowId);
		
	String childWindowId=it.next();
	System.out.println("Child window is: "+childWindowId);
	
	driver.switchTo().window(childWindowId);
	System.out.println("Child window title is: "+driver.getTitle());
	driver.close();
		
	driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title is: "+driver.getTitle());

	}

}
