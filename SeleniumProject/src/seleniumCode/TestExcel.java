package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExcel {
	
	
	@Test(dataProvider="FaceBookData")
	public void method1(String username,String password)
	{
		System.out.println("excel loaded");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://usea1wresrent1/web/base/logindisp?tenant=RES_QA1");
		

		
		driver.findElement(By.xpath("//input[@name='userid' and @placeholder='User ID'])")).sendKeys("R5");
		driver.findElement(By.xpath("//input[@name='password' and @placeholder='PASSWORD']")).sendKeys(username);
		
		
	}
	
	@DataProvider(name="FaceBookData")
	public Object[][] passData()
	{
		ReadExcelSheet excel1 = new ReadExcelSheet("C:\\Users\\pbalaraju\\eclipse-workspace\\facebookpage\\TestData\\Book1.xlsx");
		int rows=excel1.rowCount(0);
		Object [][] data = new Object[rows][2];
		for(int i=0; i<rows; i++)
		{
			data[i][0]=excel1.ReadData(0, i, 0);
			data[i][1]=excel1.ReadData(0, i, 1);
		}
		
		return data;
	}
}
