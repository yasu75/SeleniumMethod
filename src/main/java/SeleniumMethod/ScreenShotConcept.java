package SeleniumMethod;



	import java.io.File;


	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	public class ScreenShotConcept {
	
	static WebDriver driver;
	    
	    //@BeforeMethod
	    public void laucnhBrowser(){
	        System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
	        
	     driver = new ChromeDriver();
	        
	        driver.get("https://www.amazon.com");
	    }
	    
	    //@Test
	    public void takeScreenShot() throws IOException{
	        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//apache
	        FileUtils.copyFile(screenshotFile, new File("/Users/yaseminarslan/Desktop/TestPng/picture.png"));//selenium
	    }
	    
	    //@AfterMethod
	    public void close(){
	    	
	        driver.close();
	    }
		
			
		

	}


