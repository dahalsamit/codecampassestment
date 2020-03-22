package com.accesshq.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPageItem extends BasePage {

	public FormPageItem(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickFormSubmitButton() throws Exception {
		List<WebElement> element = driver.findElements(By.cssSelector(".modern button"));
		for (WebElement elem : element) {
			if (elem.getText().equals("SUBMIT")) {
				elem.click();
				return;
			}
		}
		throw new Exception("Submit button not found");

	}

	private String getErrMsg(By locater) {
		List<WebElement> element = driver.findElements(locater);
		return element.isEmpty() ? "" : element.get(0).getText();
	}

	public String getNameErrMsg() {
		return getErrMsg(By.id("name-err"));

	}

	public String getEmailErrMsg() {
		return getErrMsg(By.id("email-err"));

	}

	public String getAgreeErrMsg() {
		return getErrMsg(By.id("agree-err"));
	}

	public void setName(String name) {
		driver.findElement(By.id("name")).sendKeys(name);
	}

	public void setEmail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	public void clickAgreeCheckBox() {
		driver.findElement(By.cssSelector("[for='agree']")).click();

	}

	public String getFormsPopUpMsg() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("popup-message"), "Thanks for your feedback Dan"));
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.className("popup-message"))).getText();
	}

}
