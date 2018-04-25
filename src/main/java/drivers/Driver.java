package drivers;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import exceptions.UnknownDriverTypeExcepiton;

public class Driver {
	private static final String DEFAULT_WEB_DRIVER = "DEFAULT_WEB_DRIVER";
	private static DriverTypes defaultDriverType = DriverTypes.FIREFOX;
	private static HashMap<String, WebDriver> instances;
	
	static{
		File seleniumPath = new File("F:\\JavaProjects\\TestAutomationByWD\\src\\test\\java\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", seleniumPath.getAbsolutePath());
		System.setProperty("webdriver.chrome.driver", "F:\\JavaProjects\\TestAutomationByWD\\src\\test\\java\\chromedriver.exe");
		instances = new HashMap<String, WebDriver>();
	}
	
	public static WebDriver getWebDriverInstance(String name, DriverTypes driverType){
		
		WebDriver driver;
		if(!instances.containsKey(name)){
			switch(driverType){
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case IE:
				driver = new InternetExplorerDriver();
				break;
			case CHROME:
				driver = new ChromeDriver();
				break;
			default:
				throw new UnknownDriverTypeExcepiton();
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			instances.put(name, driver);
		}else {
			driver = instances.get(name);
		}
		return driver;
	}
	
	public static WebDriver getWebDriverInstance(String name){
		return getWebDriverInstance(name, defaultDriverType);
	}
	
	public static WebDriver getWebDriverInstance(){
		return getWebDriverInstance(DEFAULT_WEB_DRIVER);
	}
}
