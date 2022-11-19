package com.binusboard.demo;

import java.util.ArrayList;
import java.util.Scanner;

import com.binusboard.database.Database;
import com.binusboard.factories.userTypes.GoldUserTypeFactory;
import com.binusboard.factories.userTypes.StandardUserTypeFactory;
import com.binusboard.factories.userTypes.VIPUserTypeFactory;
import com.binusboard.models.Post;
import com.binusboard.models.Theme;
import com.binusboard.models.User;

public class Main {
	Scanner sc = new Scanner(System.in);
	Database db = Database.getInstance();

	public Main() {
		insertDummyData();
		User currentUser = login();
		home(currentUser);
		
		System.exit(0);
	}

	private void insertDummyData() {
		User dummyUser = new User("itslouisgs", new StandardUserTypeFactory().getInstance());
		
		dummyUser.writePost("Lorem, Ipsum!", "Lorem ipsum dolor sit amet.", 
				dummyUser.getUserType().getAvailableThemes().get(0), "20221118-post1.jpg");
		
		for (int i = 0; i < 10; i++) {
			try {
				db.register((User) dummyUser.clone());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private User login() {
		String username;
		int userType = 0;
		
		do {
			System.out.println("Login | Binus Board");
			System.out.println("===================");
			System.out.println();
			
			System.out.print("Choose user type [(1) Standard, (2) Gold, (3) VIP, (0) Exit]: ");
			
			try {
				userType = sc.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
			sc.nextLine();
			
			if (userType == 0)
				System.exit(0);
			
		} while (userType < 0 || userType > 3);


		do {
			System.out.print("Enter your username: ");
			username = sc.nextLine();
		} while (username.isEmpty() || db.getUserByUsername(username) != null);

		User user = null;
		
		if (userType == 1) {
			user = new User(username, new StandardUserTypeFactory().getInstance());
		} else if (userType == 2) {
			user = new User(username, new GoldUserTypeFactory().getInstance());
		} else if (userType == 3) {
			user = new User(username, new VIPUserTypeFactory().getInstance());
		} 
		
		db.register(user);
		
		return user;
	}
	
	private void home(User currentUser) {
		int option = 0;
		
		do {
			display();
			System.out.println("Options");
			System.out.println("=======");
			System.out.println("1. Write a post");
			System.out.println("2. Exit");
			System.out.print(">> ");

			try {
				option = sc.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
			sc.nextLine();
			
			if (option == 1) {
				writePost(currentUser);
			}
			
		} while (option != 2);
	}
	
	private void display() {
		ArrayList<User> users = db.getAllUsers();
		
		for (User user : users) {
			for (Post post : user.getPosts()) {
				System.out.println();
				System.out.println("-----------------------------------");
				System.out.println(post.getTitle());
				System.out.println("Picture: " + post.getPicture());
				System.out.println("===============");
				System.out.println(post.getContent());
				System.out.println();
				System.out.println("Theme " + post.getTheme().getName());
				System.out.println("-----------------------------------");
			}
		}
	}
	
	private void writePost(User currentUser) {
		String title, content, picture;
		int themeOpt = 0;
		
		do {
			System.out.print("Title: ");
			title = sc.nextLine();
		} while (title.length() > 100);
		
		do {
			System.out.print("Content: ");
			content = sc.nextLine();
		} while (content.length() > currentUser.getUserType().getMaxCharacter());

		do {
			System.out.println("Select theme");
			int i = 1;
			
			for (Theme t : currentUser.getUserType().getAvailableThemes()) {
				System.out.println("(" + i++ + ") " + t.getName());
			}
			
			System.out.print(">> ");
			
			try {
				themeOpt = sc.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
			sc.nextLine();
			
		} while (themeOpt < 1 || themeOpt > currentUser.getUserType().getAvailableThemes().size());
		
		do {
			System.out.print("Picture: ");
			picture = sc.nextLine();
		} while (picture.isEmpty());
		
		currentUser.writePost(title, content, currentUser.getUserType().getAvailableThemes().get(themeOpt-1), picture);
	}

	public static void main(String[] args) {
		new Main();
	}

}
