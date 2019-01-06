package seleniumCode;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShot {
	
		public static void screenshotMethod(WebDriver driver,String filePath) throws IOException
		{
			TakesScreenshot scshot = (TakesScreenshot)driver;
			File srcFile=scshot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(filePath);
			FileUtils.copyFile(srcFile, DestFile);
			
		}

}
