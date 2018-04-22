package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstarctPage {
	
	public WebDriver driver;
	
	@FindBy(className = "sign-none-loginbtn")
	protected WebElement interenceToCBOL;
	
	
	public AbstarctPage (WebDriver driver){
		PageFactory.initElements(this.driver, this);
		this.driver = driver;
	}
}
