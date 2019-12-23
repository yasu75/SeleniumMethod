package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) {
		//jacop API
		//AutoIT--jar yuklenerek calisan bir app, TestNG gibi
		
		//we can use web driver findelement send keys methods-you can define file pathname inside the sendkeys
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("/Users/yaseminarslan/Desktop/yasemin.txt");
		
		

	}

}
