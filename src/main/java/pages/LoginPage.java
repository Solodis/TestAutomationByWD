package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstarctPage {
	
	
	public LoginPage (WebDriver driver){
		super(driver);
		PageFactory.initElements(this.driver, this);
		this.driver = driver;
	}


	@FindBy(id = "index_email")
	private WebElement username;
	
	@FindBy(id = "index_pass")
	private WebElement password;
	
	@FindBy(id = "index_login_button")
	private WebElement enterence;
	
	
	public MainPage loginToVK(String emailIndex, String passIndex){
		new Actions(driver).sendKeys(username, emailIndex).build().perform();
		new Actions(driver).sendKeys(password, passIndex).build().perform();
		new Actions(driver).click(enterence).build().perform();
		
		return new MainPage(this.driver);
	}
	
	
}
