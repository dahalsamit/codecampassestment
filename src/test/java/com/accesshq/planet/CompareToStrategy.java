package com.accesshq.planet;

public class CompareToStrategy implements StringComparable {
	private String planetName;
	public CompareToStrategy(String planetName) {
		this.planetName = planetName;
	}

	public boolean compareString(String string) {
		return this.planetName.equals(string);
	}

}
