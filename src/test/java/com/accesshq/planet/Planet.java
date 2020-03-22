package com.accesshq.planet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Planet {
	protected WebElement element;

	public Planet(WebElement element) {
		this.element = element;
	}

	public String getName() {
		return element.findElement(By.tagName("h2")).getText();
	}

	public double getRadius() {
		String radius = element.findElement(By.className("radius")).getText();
		radius = radius.replace(",", "").replace("km", "");
		return Double.parseDouble(radius);
	}

	public double getDistance() {
		String distance = element.findElement(By.className("distance")).getText();
		distance = distance.replace(",", "").replace("km", "");
		return Double.parseDouble(distance);
	}

	public void clickExplore() {
		element.findElement(By.tagName("button")).click();

	}

}
