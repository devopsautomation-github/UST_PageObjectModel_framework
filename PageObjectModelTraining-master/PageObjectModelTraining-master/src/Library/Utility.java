package Library;

import java.io.File;
import java.io.IOException;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utility {

	public static String captureScreenShot(WebDriver driver, String screenshotName) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\Gaurav\\eclipse-workspace\\PageObjectModelTraining\\Screenshots\\"+ screenshotName + ".png";
		File destination = new File(path);
		Files.copy(source, destination);
		return path;
	}
	
}
