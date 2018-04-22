package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// current class is unused. Will be consider a bit later 

public class Locatorses {
	
	@FindBy(xpath = "//a[@id='endpoint']/span[contains(text(), 'Music')]")
	public static WebElement musicButton;
	
	
	public Locatorses(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

