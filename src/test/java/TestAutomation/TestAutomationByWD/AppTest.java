package TestAutomation.TestAutomationByWD;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import drivers.Driver;
import drivers.DriverTypes;
import junit.framework.TestCase;
import pages.LoginPage;
import pages.MainPage;
import utils.TestCaseListener;

/**
 * Unit test for simple App.
 */
@Listeners(TestCaseListener.class)
public class AppTest extends TestCase {
	private static Logger LOG = Logger.getLogger(AppTest.class);
	WebDriver driver = null;
	private String dataPath = "data";
	private String site = "site.vk";
	private String email = "login.username";
	private String password = "login.password";
	private ResourceBundle bundle = null;
	private MainPage mainPage;
	

	@BeforeTest
	public void startBrowser() {
		bundle = ResourceBundle.getBundle(dataPath);
		LOG.info("Statrting driver launch");
		driver = Driver.getWebDriverInstance("Chrome", DriverTypes.CHROME);
		//driver = Driver.getWebDriverInstance();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navigate();

	}

	public void navigate() {
		LOG.info("Navigate to site");
		driver.get(bundle.getString(site));
	}

	public void navigate(String path) {
		driver.get(path);
	}

	@Test
	public void login() {
		LOG.info("STEP - 1: Login");
		mainPage = new LoginPage(driver).loginToVK(bundle.getString(email),
				bundle.getString(password));
	}

	@Test
	public void botForDiman() {
		// mainPage.clickMessageButton();
	}

	@AfterTest
	public void quit() {
		driver.quit();
	}

}
