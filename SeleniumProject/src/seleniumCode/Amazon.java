package seleniumCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		//img[@alt='The Legend of Zelda: Breath of the Wild - Nintendo Switch' and @src='https://images-na.ssl-images-amazon.com/images/I/51Ox7m6-OIL._AC_SY200_.jpg']
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Account & Lists']")));
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("parimala.36@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Infor@1019");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(2000);
		
		//click on globe image  and select the radio button 
		/*driver.findElement(By.xpath("//span[@class='icp-nav-globe-img-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='radio' and @value='de_DE']")).click();
		WebElement radio= driver.findElement(By.xpath("//input[@type='radio' and @value='de_DE']"));
		radio.click();
		Thread.sleep(3000);
		boolean status =radio.isDisplayed();
		Thread.sleep(3000);
		System.out.println("radio button is enabled: "+ status);
		radio.click();
		Thread.sleep(3000); */
		
		WebElement dept=driver.findElement(By.xpath("//span[text()='Departments']"));
		
		//WebElement dept=driver.findElement(By.xpath("//span[text()='Departments']"));
		
		
		driver.close();

	
		
		
		
		/*
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement element =driver.findElement(By.xpath("//img[@alt='The Legend of Zelda: Breath of the Wild - Nintendo Switch' and @src='https://images-na.ssl-images-amazon.com/images/I/51Ox7m6-OIL._AC_SY200_.jpg']"));
		Thread.sleep(3000);
		//to scroll to a particular element
		js.executeScript("arguments[0].scrollIntoView();",element);
		Thread.sleep(3000);

		//to scroll down bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)" );
		Thread.sleep(3000);
		System.out.println("done");	
		driver.close();
		
		//scroll to a pixel
		js.executeScript("window.scollBy(0,1000)");
		//scroll to a particular element and scoll horizontal
		js.executeScript("arguments[0].scrollIntoView(); " ,element);
		//scroll to bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight();");
		
		*/
		
		driver.close();
		
		
		
		
	}

}
