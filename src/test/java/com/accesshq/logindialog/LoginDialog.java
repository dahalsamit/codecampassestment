package com.accesshq.logindialog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDialog {
	protected WebElement elem;
	public LoginDialog(WebDriver driver) {
		elem = driver.findElement(By.id("loginDialog"));
	}
	
	public void clickLoginButton() {
		this.elem.findElement(By.id("loginButton")).click();
	}

	public String getUserNameErrMsg() throws Exception {
		List<WebElement> els = this.elem.findElements(By.cssSelector("[class='v-input__slot']"));
		for(WebElement ele: els) {
			if(ele.getText().contentEquals("Username")) {
				return this.elem.findElement(By.cssSelector("[class='v-messages__message']")).getText();
			}
			
		} throw new Exception("No username field found");
		
	}
	
	public String getPasswordErrMsg() throws Exception {
		List<WebElement> els = this.elem.findElements(By.cssSelector("[class='v-input__slot']"));
		for(WebElement ele: els) {
			if(ele.getText().contentEquals("Password")) {
				return this.elem.findElement(By.cssSelector("[class='v-messages__message']")).getText();
			}
			
		}throw new Exception("No Password found");
		
	}
	



}
