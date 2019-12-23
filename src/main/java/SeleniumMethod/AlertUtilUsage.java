package SeleniumMethod;


		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;

			public class AlertUtilUsage {
			
				
			public static WebDriver driver;
			
			
			public static void main(String[] args) throws InterruptedException {
				
				
				   
				        String url = "https://mail.rediff.com/cgi-bin/login.cgi";
				        By goBtn = By.name("proceed");
				        
				        driver = Util.launchBrowser(driver, "chrome");
				        Util.launchURL(driver, url);
				        System.out.println(Util.getPageTitle(driver));
				        Util.clickOn(driver, goBtn);
				        Thread.sleep(4000);
				        
				      
				        Util.getAlertText(driver);
				        
				        //verify
				        String text=Util.getAlertText(driver);
				        if(text.equals("Please enter a valid user name")){
							System.out.println("correct alert text is :"+ text);
						}else{
							System.out.println("text is incorect.Correct text should be: "+ text);
						}
				        
				        //close the browser
				        Util.closeBrowser(driver);
				        
				        //How to handle Pop up//int ques
				      //  Alert alert=driver.switchTo().alert();
				      //  alert.accept();//OK
				      //  alert.dismiss();//cancel
				      //  alert.sendKeys(keysToSend);//send value
				     //   alert.getText(); //get string
				    }
				

			}


	


