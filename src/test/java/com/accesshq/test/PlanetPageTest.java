package com.accesshq.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.accesshq.pages.HomePage;
import com.accesshq.pages.PlanetPage;

public class PlanetPageTest extends BaseTestSuit {

	@Test
	void PlanetItemTest() throws Exception {
		HomePage homePage = new HomePage(driver);
		PlanetPage planetPage = homePage.clickPlanetPage();
		String planetName = "Neptune";
		Assertions.assertEquals("Neptune", planetPage.getPlanetName(planetName));
		Assertions.assertEquals("Exploring Neptune", planetPage.getExploreMsg(planetName));

	}

}
