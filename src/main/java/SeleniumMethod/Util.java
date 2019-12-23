package SeleniumMethod;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Util {  
		public static final int DEFAULT_EXP_WAIT=15;
		
		//it has common methods
		//This method is used to handle JS alert

		
		/**
		 * The method is used to handle alert
		 * @param driver
		 * @return
		 */
		public static String getAlertText(WebDriver driver){
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println(text);
			//alert.accept();
			//alert.dismiss();
			alert.sendKeys("yasemin");
			return text;
			
		}
		
		
		/**
		 * to get title of the page
		 * @param driver
		 * @return
		 */
		public static String getPageTitle(WebDriver driver){
			return driver.getTitle();
		}
		
		
		/**
		 * to get url of the page
		 * @param driver
		 * @param url
		 */
		public static void launchURL(WebDriver driver, String url){
			driver.get(url);
		}
		
		/**
		 * This is laucnh browser
		 * @param driver
		 * @param browserName
		 * @return
		 */
		public static WebDriver launchBrowser(WebDriver driver, String browserName){
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
				driver = new ChromeDriver();
			}
			else if(browserName.equals("firefox")){
				System.setProperty("webdriver.gecko.driver", "/Users/yaseminarslan/Downloads/geckodriver");
				driver = new FirefoxDriver();
			}
			else{
				System.out.println("Browser is not correct "+ browserName);
			}
			return driver;
			
		}
		
		/**
		 * click on Element
		 * @param driver
		 * @param locator
		 */
		public static void clickOn (WebDriver driver, By locator){
			driver.findElement(locator).click();
		}
		
		/**
		 * close browser
		 * @param driver
		 */
		public static void closeBrowser(WebDriver driver){
			driver.quit();
		}
		
		/**
		 * get Element from HTML
		 * @param driver
		 * @param locator
		 * @return
		 */
		
		public static WebElement getElement(WebDriver driver, By locator){
			WebElement element = driver.findElement(locator);
			return element;
			
		}
		
	}

	


