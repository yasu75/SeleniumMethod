package SeleniumMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		//int.quest:how to handle auth pop-up
		//https://username+password@the-internet.herokuapp.com/basic_auth
		//driver.get(https://username:password@URL-its answer
		String username="admin";
		String password="admin";
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
	}

}
