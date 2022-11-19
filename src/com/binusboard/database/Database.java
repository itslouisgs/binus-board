package com.binusboard.database;

import java.util.ArrayList;

import com.binusboard.models.User;

public class Database {
	private static Database instance;
	private ArrayList<User> users;
	
	private Database() {
		this.users = new ArrayList<>();
	}
	
	public static Database getInstance() {
		if (instance == null) {
			synchronized (Database.class) {
				instance = new Database();
			}
		}
		
		return instance;
	}
	
	public void register(User user) {
		users.add(user);
	}
	
	public User getUserByUsername(String username){
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		
		return null;
	}
	
	public ArrayList<User> getAllUsers(){
		return users;
	}
}
