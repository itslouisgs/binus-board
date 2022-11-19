package com.binusboard.factories.themes;

import com.binusboard.models.Border;

public class HeroesThemeFactory implements ThemeFactory {

	@Override
	public String getName() {
		return "Heroes";
	}
	
	@Override
	public String getBackground() {
		return "#376282";
	}

	@Override
	public Border getBorder() {
		return new Border("solid", "abu-abu gelap metalik");
	}

	@Override
	public String getIcon() {
		return "superhero.jpg";
	}

	@Override
	public String getMusic() {
		return "klasik-tegang-bersemangat.mp3";
	}
	
}
