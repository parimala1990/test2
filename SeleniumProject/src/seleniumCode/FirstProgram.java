package seleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\gco\\geckodriver.exe");
		/* FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		 WebDriver driver = new FirefoxDriver(options);*/
		 
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
		 driver.get(" http://usea1wresrent1/web/base/logindisp?tenant=RES_QA1");
		 
		 //explicit wait
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='userid' and @placeholder='User ID']")));
		 driver.findElement(By.xpath("//input[@name='userid' and @placeholder='User ID']")).sendKeys("R5");
		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='PASSWORD' and @name='password']")));
		 driver.findElement(By.xpath("//input[@placeholder='PASSWORD' and @name='password']")).sendKeys("HMSr5U$ER");
		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Log In')]")));
		 driver.findElement(By.xpath("//span[contains(text(),'Log In')]/ancestor::a")).click();
		 
		 Thread.sleep(15000); //dont remove this wait
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Fleet']/ancestor::a")));
		driver.findElement(By.xpath("//span[text()='Fleet']/ancestor::a")).click();
		

		  
		  
		  
		  
		
		
	}

}
