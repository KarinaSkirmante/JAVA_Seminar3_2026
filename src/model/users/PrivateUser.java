package model.users;

import java.util.ArrayList;

import model.Post;
import model.enums.PostType;

public class PrivateUser extends RegisteredUser{

	//1.mainigie
	private ArrayList<Post> allPrivatePosts = new ArrayList<Post>();
	private ArrayList<Post> allPublicPosts  = new ArrayList<Post>();
	private ArrayList<RegisteredUser> allMyFollowers = new ArrayList<RegisteredUser>();
	
	//2.getters

	public ArrayList<Post> getAllPrivatePosts() {
		return allPrivatePosts;
	}

	public ArrayList<Post> getAllPublicPosts() {
		return allPublicPosts;
	}

	public ArrayList<RegisteredUser> getAllMyFollowers() {
		return allMyFollowers;
	}
	//3.setters
	//netiks veidoti, jo nebus iespeja saglabat ieprieks definetus sarakstus ieks si objekta
	//4. abi konstruktori
	public PrivateUser()
	{
		super();//tiek izsaukts registeredUser bezargumenta konstruktors
		
	}
	
	public PrivateUser(String inputUsername, String inputPassword) {
		super(inputUsername, inputPassword);//izsauksies RegisteredUser argumenta konstruktors
	}
	
	//5. toString
	//super.toString() nozime, ka izsauksies RegistereUser toString funkcija
	public String toString() {
		String result = super.toString() 
				+ "sludinajumi:\n -> " + allPrivatePosts + "\n ->" + allPublicPosts 
				+ ";\n sekotaji -> " + allMyFollowers;
		return result;
	}
	
	//6.citas funkcijas	
	@Override
	public void createAndPublishPost(String inputMsg, PostType inputPostType) {
		// TODO Auto-generated method stub
		
	}


}
