package com.binusboard.factories.themes;

import com.binusboard.models.Border;

public class PartyThemeFactory implements ThemeFactory {

	@Override
	public String getName() {
		return "Party";
	}
	
	@Override
	public String getBackground() {
		return "#F9A7B0";
	}

	@Override
	public Border getBorder() {
		return new Border("putus-putus", "merah maroon");
	}

	@Override
	public String getIcon() {
		return "dansa.png";
	}

	@Override
	public String getMusic() {
		return "musik-semangat-menarik.mp3";
	}
	
}
