package utils;

import java.io.File;  
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Screenshots {
/*	
	private static final String SCREENSHOT_FOLDER = "test_outout/html";
	private static final String SCREENSHOT = "screenshots";
	private static final String DEFAULT_MASSEGE = "See screenShot";
	
	
	public static String getScreeshot(WebDriver driver, String message){
		try {
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String filePath = SCREENSHOT_FOLDER + screenshot.getName();
			try {
				FileUtils.copyFileToDirectory(screenshot, new File(SCREENSHOT_FOLDER + SCREENSHOT));
			} catch (IOException e) {;}
			
			String resultMessage = "<a href='" + filePath + "'>" + message + "</a>";
			return resultMessage;
		} catch (WebDriverException e) {
			return "Browser: connection is lost at moment of error '" + message + "'.";
		} catch (NullPointerException e) {
			return "Browser: '" + message + "'.";
		}
		
	}
	
	public static void clearingScreenshotFolder(){
		File screenFolder = new File (SCREENSHOT_FOLDER);
		File[] files = screenFolder.listFiles();
		for(int i = 0; i < files.length; i++){
			files[i].delete();
		}
	}
*/
}
