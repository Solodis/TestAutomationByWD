package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstarctPage {
	
	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(className = "left_label inl_bl")
	private WebElement messageButton;
	
	public void clickMessageButton(){
		new Actions(driver).click(messageButton).build().perform();
	}
}
