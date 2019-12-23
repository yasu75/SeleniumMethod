package SeleniumMethod;


		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class BackandForwardConcept {

			public static void main(String[] args) throws InterruptedException {
				//set property
				System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
				
				//launch browser
				WebDriver driver = new ChromeDriver();
						
				//enter URL
				driver.get("https://www.google.com/");	//get navigate to webpage 
				Thread.sleep(2000);
				
				
				driver.navigate().to("https://www.amazon.com/");
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().refresh();
				
				//Get
				//navigate
			}

		}

	


