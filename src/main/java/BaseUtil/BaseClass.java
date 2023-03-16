package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;//WebDriver is interface
	public HomePage homePage;
	
	// before start a test what need to be done
	@BeforeMethod
	public void setUp() {
		// First job is to recognize the location of driver
		System.setProperty("webdriver.chrome.driver","/Users/tanzellaislam/eclipse-workspace/com.macy/driver/chromedriver");
		// Then we need to instantiate the driver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		// Then we need to instantiate the driver
		driver = new ChromeDriver(options);
		// maximize method maximize the window
		driver.manage().window().maximize();
		// deleteAllcookies do delete the cookies
		driver.manage().deleteAllCookies();
		// get method get the trageted url
		driver.get("https://www.macys.com/");
		//Pageloadtimeout is to wait to load the page for curtain amount
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// Implicitly wait is to wait for a web element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	} 

	// after a test is done, what need to do
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
}
