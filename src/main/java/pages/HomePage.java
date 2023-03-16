package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// pageFactory help to instantiate WedElements
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Women']")
	WebElement womanButton;

	@FindBy (xpath = "//span[text()='Beauty']")
	WebElement beautyButton;

	@FindBy(className = "header-logo__image")
	WebElement logo;

	@FindBy(id = "registry-link")
	WebElement weddingRegistry;

	@FindBy(how =How.XPATH,using = "//a [@class =\"fob-red\"]")
	WebElement saleButton;

	public void womanbuttonClick() throws InterruptedException {
		womanButton.click();
		Thread.sleep(3000);
	}

	public void beautyButtonClick() throws InterruptedException {
		beautyButton.click();
		Thread.sleep(20);
	}

	public boolean logoIsDisplay() {
		boolean img =logo.isDisplayed();
		System.out.println("The logo is display" + img);
		return img;
	}

	public void weddingRegistryClick() {
		weddingRegistry.click();
	}	

	public void saleButtonClick() {
		saleButton.click();
	}
}
