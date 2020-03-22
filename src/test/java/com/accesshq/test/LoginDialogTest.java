package com.accesshq.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.accesshq.logindialog.LoginDialog;
import com.accesshq.pages.HomePage;

public class LoginDialogTest extends BaseTestSuit {

	@Test
	void testLoginErrMsg() throws Exception {
		HomePage homePage = new HomePage(driver);
		LoginDialog loginDialog = homePage.clickUserMenuItem();
		loginDialog.clickLoginButton();
		Assertions.assertEquals("Invalid user and password", loginDialog.getUserNameErrMsg(), "Expected should be equal to Actual");
		Assertions.assertEquals("Invalid user and password", loginDialog.getPasswordErrMsg(), "Expected should be equal to Actual");

	}

}
