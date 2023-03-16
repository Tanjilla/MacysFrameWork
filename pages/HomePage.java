package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// pageFactory help to instantiate WedElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "cms login-submit")
	WebElement loginButton;
	
	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
}
