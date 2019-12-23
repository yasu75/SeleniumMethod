package SeleniumMethod;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverBasic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
		WebDriverManager.chromedriver().setup();
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//enter URL
		driver.get("https://www.google.com/");
		
		//get title
		String title=driver.getTitle();
		System.out.println("website title is :"+ title);
		
		//Verify /validate
		if(title.equals("Google")){
			System.out.println("correct title is :"+ title);
		}else{
			System.out.println("title is incorect.Correct title should be: "+ title);
		}
		//get current URL
		
		
		String URL= driver.getCurrentUrl();
		if(URL.equals("https://www.google.com/")){
			System.out.println("correct url is :"+ URL);
		}else{
			System.out.println("URL is incorect.Correct URL should be: "+ URL);
		}
		//System.out.println(driver.getPageSource());
		
		Thread.sleep(5000);
		
		driver.quit();//close the browser
	}

}

