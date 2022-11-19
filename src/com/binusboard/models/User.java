package com.binusboard.models;

import java.util.ArrayList;

import com.binusboard.builders.PostBuilder;
import com.binusboard.models.userTypes.UserType;

public class User implements Cloneable {
	private String username;
	private UserType userType;
	private final ArrayList<Post> posts;
	
	public User(String username, UserType userType) {
		super();
		this.username = username;
		this.userType = userType;
		this.posts = new ArrayList<>();
	}

	public String getUsername() {
		return username;
	}

	public UserType getUserType() {
		return userType;
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}
	
	public void writePost(String title, String content, Theme theme, String picture) {
		PostBuilder builder = new PostBuilder();
		
		posts.add(builder.
			setTitle(title).
			setContent(content).
			setTheme(theme).
			setPicture(picture).
			build()
		);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
