package com.accesshq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.accesshq.logindialog.LoginDialog;

public class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public FormPageItem clickFormMenuItem() {
		driver.findElement(By.cssSelector(".v-toolbar__items>[aria-label='forms']")).click();
		return new FormPageItem(driver);
	}
	
	public LoginDialog clickUserMenuItem() {
		driver.findElement(By.className("users")).click();
		return new LoginDialog(driver);
	}
	
	public PlanetPage clickPlanetPage() {
		driver.findElement(By.cssSelector(".v-toolbar__items>[aria-label='planets']" )).click();
		return new PlanetPage(driver);
	}

}
