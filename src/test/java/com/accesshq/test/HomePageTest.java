package com.accesshq.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.accesshq.pages.HomePage;

class HomePageTest extends BaseTestSuit {

	@Test
	void popUpMsgTest() {
		HomePage homePage = new HomePage(driver);
		String name = "Dan";
		homePage.setInputField(name);
		homePage.clickSubmitButton();
		Assertions.assertEquals("Hello Dan", homePage.getPopUpMsg(), "The expected value should match actual");
	}

	@Test
	void clickMeDown() {
		HomePage homePage = new HomePage(driver);
		Assertions.assertEquals("CLICK ME UP!", homePage.clickMeDown());

	}

	@Test
	void clickMeUP() {
		HomePage homePage = new HomePage(driver);
		Assertions.assertEquals("CLICK ME DOWN!", homePage.clickMeUp());

	}

	@Test
	void LoveListTest() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.clickHeart();
		Assertions.assertEquals("You loved List Item 2", homePage.getHeartPopupMsg(),
				"Actual should be equall to expected");
	}

	@Test
	void buttonLoginTest() {
		HomePage homePage = new HomePage(driver);
		homePage.clickButtonLogin();
		Assertions.assertEquals("You clicked the login button", homePage.getButtonLoginMsg(),
				"Actual should match expected");

	}

	@Test
	void buttonCancelTest() {
		HomePage homePage = new HomePage(driver);
		homePage.clickCancelButton();
		Assertions.assertEquals("You clicked the cancel button", homePage.getCancelButtonMsg(),
				"Expected should match Actual");

	}

	@Test
	void buttonHomeTest() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.clickHomeButton();
		Assertions.assertEquals("You clicked the home button", homePage.getHomeButtonMsg(),
				"Expected value should match actual");

	}

	@Test
	void buttonLinkTest() {
		HomePage homePage = new HomePage(driver);
		homePage.clickLinkButton();
		Assertions.assertEquals("You clicked the link button", homePage.getLinkButtonMsg(),
				"Actual should be equall to expected");

	}

	@Test
	void buttonUploadTest() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.clickUploadButtom();
		Assertions.assertEquals("You clicked the upload button", homePage.getUploadButtonMsg(),
				"Actual should be equall to expected");

	}

}
