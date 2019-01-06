package seleniumCode;


import java.awt.event.WindowStateListener;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.Capabilities;

public class ScrollWebPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,30);
		//driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		driver.get("http://usea1wresrent1/web/base/logindisp?tenant=RES_QA1");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='userid' and @placeholder='User ID']")));
		 driver.findElement(By.xpath("//input[@name='userid' and @placeholder='User ID']")).sendKeys("R5");
		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='PASSWORD' and @name='password']")));
		 driver.findElement(By.xpath("//input[@placeholder='PASSWORD' and @name='password']")).sendKeys("HMSr5U$ER");
		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Log In')]")));
		 driver.findElement(By.xpath("//span[contains(text(),'Log In')]/ancestor::a")).click();
	//	driver.manage().window().maximize();
	
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Reservations']/ancestor::a")));
		driver.findElement(By.xpath("//span[text()='Reservations']/ancestor::a")).click();
		Thread.sleep(5000);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class,'x-menu-item-link')]//span[text()='Reservations']")));
			driver.findElement(By.xpath("//a[contains(@class,'x-menu-item-link')]//span[text()='Reservations']")).click();
			Thread.sleep(15000);
	
		
		JavascriptExecutor js =(JavascriptExecutor)driver;

	//	js.executeScript("window.scrollBy(5000,0)");
		Thread.sleep(3000);
		System.out.println("executed successfully");
		driver.close();

	}

}
