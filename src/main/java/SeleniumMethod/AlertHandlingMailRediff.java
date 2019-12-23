package SeleniumMethod;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;


		import io.github.bonigarcia.wdm.WebDriverManager;

		public class AlertHandlingMailRediff {
			
			static WebDriver driver;

			public static void main(String[] args) throws InterruptedException {
				
					WebDriverManager.chromedriver().setup();
					
						WebDriver driver = new ChromeDriver();
						
						driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

						driver.findElement(By.name("proceed")).click();
						Thread.sleep(4000);
						
						getALertText();

						
			}		
					
			public static String getALertText(){
				
				Alert alert = driver.switchTo().alert();
				String text = alert.getText();
				System.out.println(text);
				alert.accept();
				return text;
			}		

		}
	


