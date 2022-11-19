package com.binusboard.factories.themes;

import com.binusboard.models.Border;

public class SerenityThemeFactory implements ThemeFactory {

	@Override
	public String getName() {
		return "Serenity";
	}
	
	@Override
	public String getBackground() {
		return "#EFEFEF";
	}

	@Override
	public Border getBorder() {
		return new Border("solid", "putih salju dengan bayangan hitam");
	}

	@Override
	public String getIcon() {
		return "rubah-putih.jpeg";
	}

	@Override
	public String getMusic() {
		return "musik-tenang.mp3";
	}
	
}
