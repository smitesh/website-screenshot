import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Prototype: This class uses selenium webdriver to take screenshots of different websites.
 * 
 * @author Smitesh SS
 * @version 1.1
 */
public class WebsiteShoter {
  
	public static void main(String[] args) {
	    WebDriver webDriver = new FirefoxDriver();	    
	    webDriver.navigate().to("http://www.ankitgulatiphotography.com");
	    TakesScreenshot screenshotTaker = (TakesScreenshot) webDriver;
	    File screenshotFile = screenshotTaker.getScreenshotAs(OutputType.FILE);
	    try {
	        FileUtils.copyFile(screenshotFile, new File("/srv/ankit.png"));
        } catch (IOException e) {
	        e.printStackTrace();
        }
    }

}
