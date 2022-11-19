package com.binusboard.builders;

import com.binusboard.models.Post;
import com.binusboard.models.Theme;

public class PostBuilder {
	
	private Post post;

	public PostBuilder() {
		post = new Post();
	}

	public PostBuilder setTitle(String title) {
		post.setTitle(title);
		return this;
	}
	
	public PostBuilder setContent(String content) {
		post.setContent(content);
		return this;
	}
	
	public PostBuilder setTheme(Theme theme) {
		post.setTheme(theme);
		return this;
	}
	
	public PostBuilder setPicture(String picture) {
		post.setPicture(picture);
		return this;
	}
	
	public Post build() {
		return post;
	}
	
}
