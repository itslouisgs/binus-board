package com.binusboard.models;

import com.binusboard.factories.themes.ThemeFactory;

public class Theme {
	
	private String name;
	private String background;
	private Border border;
	private String icon;
	private String music;
	
	public Theme(ThemeFactory themeFactory) {
		super();
		this.name = themeFactory.getName();
		this.background = themeFactory.getBackground();
		this.border = themeFactory.getBorder();
		this.icon = themeFactory.getIcon();
		this.music = themeFactory.getMusic();
	}

	public String getName() {
		return name;
	}
	
	public String getBackground() {
		return background;
	}
	
	public Border getBorder() {
		return border;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public String getMusic() {
		return music;
	}
	
}
