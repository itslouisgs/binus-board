package com.binusboard.factories.themes;

import com.binusboard.models.Border;

public interface ThemeFactory {
	public String getName();
	public String getBackground();
	public Border getBorder();
	public String getIcon();
	public String getMusic();
}
