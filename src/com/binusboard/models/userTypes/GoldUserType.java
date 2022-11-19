package com.binusboard.models.userTypes;

import com.binusboard.factories.themes.GoldThemeFactory;
import com.binusboard.models.Theme;

public class GoldUserType extends UserType {

	public GoldUserType() {
		super("Gold", 1000);
	}

	@Override
	protected void setDefaultThemes() {
		super.setDefaultThemes();
		availableThemes.add(new Theme(new GoldThemeFactory()));
	}
}
