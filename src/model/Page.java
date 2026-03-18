package model;

import java.util.ArrayList;

import model.users.RegisteredUser;

public class Page {
	//1.mainigie
	private String title;
	private String description;
	private ArrayList<RegisteredUser> allPageFollowers = new ArrayList<RegisteredUser>();
	private ArrayList<Post> allPostsInPage = new ArrayList<Post>();
	//2.getters
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public ArrayList<RegisteredUser> getAllPageFollowers() {
		return allPageFollowers;
	}
	public ArrayList<Post> getAllPostsInPage() {
		return allPostsInPage;
	}
	//3.setters
	public void setTitle(String inputTitle) {
		if(inputTitle != null && !inputTitle.isEmpty() && inputTitle.matches("[A-Z]{1}[a-zA-Z0-9 .,]{3,30}")) {
			title = inputTitle;
		}
		else
		{
			title = "Unknown";
		}
		
	}
	public void setDescription(String inputDescription) {
		if(inputDescription != null && !inputDescription.isEmpty() && inputDescription.matches("[A-Z]{1}[a-zA-Z0-9 .,]{3,100}")) {
			description = inputDescription;
		}
		else
		{
			description = "Unknown";
		}
	}
	
	//4.abi konstruktori
	public Page() {
		setTitle("Noklusejuma lapa");
		setDescription("Lapa par neko");
	}
	
	public Page(String inputTitle, String inputDescription) {
		setTitle(inputTitle);
		setDescription(inputDescription);
	}
	public String toString() {
		String result = title + " " + description + "; sludinajumi\n ->" + allPostsInPage + "\n sekotaji: " + allPageFollowers;
		return result;
	}

}
