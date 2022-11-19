package com.binusboard.models;

public class Border {
	private String style;
	private String color;
	
	public Border(String style, String color) {
		super();
		this.style = style;
		this.color = color;
	}

	public String getStyle() {
		return style;
	}

	public String getColor() {
		return color;
	}
}
