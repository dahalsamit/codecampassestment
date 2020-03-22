package com.accesshq.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.accesshq.planet.CompareToStrategy;
import com.accesshq.planet.Planet;

public class PlanetPage extends BasePage {

	public PlanetPage(WebDriver driver) {
		super(driver);
	}

	public String getPlanetName(String planetName) throws Exception {
		List<WebElement> element = driver.findElements(By.className("planet"));
		for (WebElement planet : element) {

			if (new CompareToStrategy(new Planet(planet).getName()).compareString(planetName)) {
				return new Planet(planet).getName();
			}
		}
		throw new Exception("no planet with name" + planetName + " found");
	}

	public double getDistanceFromSun(String planetName) throws Exception {
		List<WebElement> element = driver.findElements(By.className("planet"));
		for (WebElement planet : element) {
			if (new CompareToStrategy(new Planet(planet).getName()).compareString(planetName)) {
				return new Planet(planet).getDistance();

			}
		}
		throw new Exception("Distance not found");
	}

	public String getExploreMsg(String planetName) throws Exception {
		List<WebElement> element = driver.findElements(By.className("planet"));
		for (WebElement planet : element) {
			if (new CompareToStrategy(new Planet(planet).getName()).compareString(planetName)) {
				new Planet(planet).clickExplore();
				WebDriverWait wait = new WebDriverWait(driver, 30);
				return wait.until(ExpectedConditions.presenceOfElementLocated(By.className("popup-message"))).getText();

			}
		}
		throw new Exception("No such element");
	}

}
