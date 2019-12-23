package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment5_LoginPage {

	
		public static WebDriver driver;
		
		static By email=By.id("user[email]");
		static By password =By.id("user[password]");
		static By signInBtn=By.className("g-recaptcha");
		

		public static void main(String[] args) throws InterruptedException {
			
			driver=Util.launchBrowser(driver, "chrome");
			Util.launchURL(driver,"https://courses.ultimateqa.com/users/sign_in");
			Thread.sleep(3000);
			
			
			Util.getElement(driver, email).sendKeys("yaseminyenipazar@gmail.com");
			Util.getElement(driver,password).sendKeys("test123");
			Util.getElement(driver,signInBtn).click();

			String title=driver.getTitle();
			System.out.println("website title is :"+ title);
			
			
			if(title.equals("Ultimate QA")){
				System.out.println("correct title is :"+ title);
			}else{
				System.out.println("title is incorect.Correct title should be: "+ title);
			}
		}
}
