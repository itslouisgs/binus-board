package com.binusboard.factories.themes;

import com.binusboard.models.Border;

public class GoldThemeFactory implements ThemeFactory {

	@Override
	public String getName() {
		return "Gold";
	}
	
	@Override
	public String getBackground() {
		return "#FFD700";
	}

	@Override
	public Border getBorder() {
		return new Border("solid", "emas gelap");
	}

	@Override
	public String getIcon() {
		return "koin-emas.jpeg";
	}

	@Override
	public String getMusic() {
		return "klasik.mp3";
	}
	
}
