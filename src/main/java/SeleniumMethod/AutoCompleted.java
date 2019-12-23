package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleted {

	public static void main(String[] args) throws InterruptedException {		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        
        autocomplete.sendKeys("5100 Highbridge Street, Fayetteville, NY, USA");
     
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-container")));
        autocompleteResult.click();
        driver.quit();

	}

}
