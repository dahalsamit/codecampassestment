package com.accesshq.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.accesshq.pages.FormPageItem;
import com.accesshq.pages.HomePage;

public class FormPageTest extends BaseTestSuit {

	@Test
	void formMenuItemTest() throws Exception {
		HomePage homePage = new HomePage(driver);
		FormPageItem formPage = homePage.clickFormMenuItem();
		formPage.clickFormSubmitButton();
		Assertions.assertEquals("Your name is required", formPage.getNameErrMsg(), "Actual should match expected");
		Assertions.assertEquals("Your email is required", formPage.getEmailErrMsg(), "Actual should match expected");
		Assertions.assertEquals("You must agree to continue", formPage.getAgreeErrMsg(),
				"Actual should match expected");
		formPage.setName("Dan");
		formPage.setEmail("dan@abc.com");
		formPage.clickAgreeCheckBox();
		Assertions.assertEquals("", formPage.getNameErrMsg(), "Name Field is Mandatory");
		Assertions.assertEquals("", formPage.getEmailErrMsg(), "Email Field is Mandatory");
		Assertions.assertEquals("", formPage.getAgreeErrMsg(), "You must agree to continue");
		formPage.clickFormSubmitButton();
		Assertions.assertEquals("Thanks for your feedback Dan", formPage.getFormsPopUpMsg(), "Actual should match expected");
		


	}

}
