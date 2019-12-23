package SeleniumMethod;

		import org.openqa.selenium.By;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

		public class AlertHandling {

		public static void main(String[] args) throws InterruptedException {
				//Set property
				System.setProperty("webdriver.chrome.driver", "/Users/yaseminarslan/Downloads/chromedriver");
				
				//launch browser
				WebDriver driver = new ChromeDriver();
				
				//enter URL
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
				
				//we go to web page and go button and press right click inspect to find htlm for to button
				driver.findElement(By.name("proceed")).click();
				Thread.sleep(4000);
				 
				//to handle popups
				
				Alert alert=driver.switchTo().alert();
				String text=alert.getText();//methos is alert.getText, we want to verify it so we identify it as a string
				System.out.println(text);
				alert.accept();
				
				//verify
				if(text.equals("Please enter a valid user name")){
					System.out.println("correct text :"+ text);
				}else{
					System.out.println("text is incorect.Correct text should be: "+ text);
				}
				alert.accept();
				
				driver.quit();
				
				
				
			}

		}


	


