package testPages;

import org.testng.annotations.Test;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass{

	@Test(enabled = false,priority = 1)
	public void womanButtonClickTest() throws InterruptedException {
		homePage.womanbuttonClick();

	}

	@Test(enabled = false, priority = 2)
	public void beautyButtonClickTest() throws InterruptedException {
		homePage.beautyButtonClick();
	}

	@Test(enabled = false, priority = 3)
	public void logoTest() {
		homePage.logoIsDisplay();
	}

	@Test(enabled = false, priority = 4)
	public void weddingRegistryClickTest() {
		homePage.weddingRegistryClick();
	}

	@Test(enabled = true, priority = 5)
	public void saleButtonClickTest() {
		homePage.saleButtonClick();
	}

}
