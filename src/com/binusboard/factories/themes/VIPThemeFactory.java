package com.binusboard.factories.themes;

import com.binusboard.models.Border;

public class VIPThemeFactory implements ThemeFactory {

	@Override
	public String getName() {
		return "VIP";
	}
	
	@Override
	public String getBackground() {
		return "#E5E4E2";
	}

	@Override
	public Border getBorder() {
		return new Border("solid", "putih bersih");
	}

	@Override
	public String getIcon() {
		return "mahkota.jpg";
	}

	@Override
	public String getMusic() {
		return "klasik.mp3";
	}
	
}
