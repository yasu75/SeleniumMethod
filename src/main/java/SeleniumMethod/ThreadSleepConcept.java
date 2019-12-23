package SeleniumMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThreadSleepConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//thread sleep is not part of the selenium, it comes from java
		//it is static wait
		//it is used to slow down element or thread in webpage
		
		Thread.sleep(5000);//hubspot waits 5 second so to get the actual title browser it has to wait 5 second too,
						   //because we  get title of actual browser
		System.out.println("Title is: "+ driver.getTitle());
		
	}

}
