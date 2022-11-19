package com.binusboard.models.userTypes;

import java.util.ArrayList;

import com.binusboard.factories.themes.HeroesThemeFactory;
import com.binusboard.factories.themes.PartyThemeFactory;
import com.binusboard.factories.themes.SerenityThemeFactory;
import com.binusboard.models.Theme;

public class UserType {
	private String typeName;
	private int maxCharacter;
	protected ArrayList<Theme> availableThemes;
	
	protected UserType(String typeName, int maxCharacter) {
		super();
		this.typeName = typeName;
		this.maxCharacter = maxCharacter;
		this.availableThemes = new ArrayList<>();
		setDefaultThemes();
	}

	public String getTypeName() {
		return typeName;
	}

	public int getMaxCharacter() {
		return maxCharacter;
	}

	public ArrayList<Theme> getAvailableThemes() {
		return availableThemes;
	}
	
	protected void setDefaultThemes() {
		availableThemes.add(new Theme(new SerenityThemeFactory()));
		availableThemes.add(new Theme(new PartyThemeFactory()));
		availableThemes.add(new Theme(new HeroesThemeFactory()));
	}
}
