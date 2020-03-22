package com.accesshq.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void setInputField(String name) {
		driver.findElement(By.id("forename")).sendKeys(name);
	}

	public void clickSubmitButton() {
		driver.findElement(By.id("submit")).click();
	}

	public String getPopUpMsg() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("popup-message"), "Hello"));
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.className("popup-message"))).getText();
	}

	public String clickMeDown() {
		driver.findElement(By.cssSelector("[role='button']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(
				ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("[role='button']"), "CLICK ME UP!"));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("transition-y"))).getText();

	}

	public String clickMeUp() {
		driver.findElement(By.cssSelector("[role='button']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("[role='button']"),
				"CLICK ME DOWN!"));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[role='button']"))).getText();

	}

	public void clickHeart() throws Exception {
		List<WebElement> element = driver.findElements(By.cssSelector("[class='list-item']"));
		for (WebElement elem : element) {
			if (elem.findElement(By.cssSelector("[class='list-title']")).getText().equals("List Item 2")) {
				elem.findElement(By.cssSelector("[class='list-item-button']")).click();
				return;
			}
		}
		throw new Exception("No such element found");

	}

	public String getHeartPopupMsg() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("popup-message"))).getText();
	}

	public void clickButtonLogin() {
		driver.findElement(By.id("loginButton")).click();
	}

	public String getButtonLoginMsg() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-message"))).getText();

	}

	public void clickCancelButton() {
		driver.findElement(By.id("cancelButton")).click();;

	}

	public String getCancelButtonMsg() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("alert-message"),
				"You clicked the cancel button"));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-message"))).getText();
	}

	public void clickHomeButton() throws Exception {
		List<WebElement> element = driver.findElements(By.cssSelector("[aria-label='home']"));
		for(WebElement elem: element) {
			if(elem.getText().equals("home")) {
				elem.click();
				return;
			}
		}throw new Exception("Home icon not found");
	}

	public String getHomeButtonMsg() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("alert-message"),
				"You clicked the home button"));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-message"))).getText();
	}

	public void clickLinkButton() {
		driver.findElement(By.cssSelector("[aria-label='link-button']")).click();
	}

	public String getLinkButtonMsg() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("alert-message"),
				"You clicked the link button"));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-message"))).getText();

	}

	public void clickUploadButtom() throws Exception {
		List<WebElement> element = driver.findElements(By.cssSelector("[aria-hidden='true']"));
		for(WebElement elem: element) {
			if(elem.getText().equals("cloud_upload")) {
				elem.click();
				return;
			}
		} throw new Exception("Upload button not found");
	}

	public String getUploadButtonMsg() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("alert-message"),
				"You clicked the upload button"));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-message"))).getText();

	}

}
