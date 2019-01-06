package seleniumCode;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		/*WebElement menu=driver.findElement(By.xpath("//span[text()='Electronics']//ancestor::li"));
		
		
		//WebElement subMenu=driver.findElement(By.xpath("//a[text()='Mobiles']//ancestor::li[contains(@class,'_1KCOnI ')]"));
		
		
		WebElement subMenu=driver.findElement(By.xpath("//a[text()='Realme']//ancestor::li[contains(@class,'_1KCOnI ')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).clickAndHold().build().perform();
		//subMenu.click();
		 action.click(subMenu).perform();
		//action.moveToElement(menu).moveToElement(subMenu).click().perform();
		//action.moveToElement(subMenu).click().build().perform();
		Thread.sleep(3000);*/
		
		
		 WebElement MainMenu = driver.findElement(By.xpath("//a[@title='Electronics']"));
		  WebElement SubMenu = driver.findElement(By.xpath("//a[@title='Samsung']"));
		  Actions action = new Actions(driver);
		  action.moveToElement(MainMenu).clickAndHold().build().perform();
		  WebDriverWait wait = new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.elementToBeClickable(SubMenu));
		  action.click(SubMenu).perform();
		
		
		System.out.println("log 1");

		//move to an element in the menu item
		
		//button[@class='_2AkmmA _29YdH8']
	/*	String mainWindow =driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Thread.sleep(2000);
		Iterator<String> iter = windows.iterator();
		while(iter.hasNext())
		{
			String childWindow=iter.next();
			if(!mainWindow.equals(childWindow))
			{
				WebDriver s=driver.switchTo().window(childWindow);
				System.out.println(s.getTitle());
				driver.findElement(By.xpath("")).click();
			}
		}*/
		
		//driver.close();
		

	}

}
