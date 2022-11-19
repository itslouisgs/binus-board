package com.binusboard.models.userTypes;

import com.binusboard.factories.themes.GoldThemeFactory;
import com.binusboard.factories.themes.VIPThemeFactory;
import com.binusboard.models.Theme;

public class VIPUserType extends UserType {

	public VIPUserType() {
		super("VIP", 1000);
	}

	@Override
	protected void setDefaultThemes() {
		super.setDefaultThemes();
		availableThemes.add(new Theme(new GoldThemeFactory()));
		availableThemes.add(new Theme(new VIPThemeFactory()));
	}
}
