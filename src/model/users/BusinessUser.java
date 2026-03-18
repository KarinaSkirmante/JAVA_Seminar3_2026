package model.users;

import java.util.ArrayList;
import java.util.Random;

import model.Page;
import model.Post;
import model.enums.PostType;

public class BusinessUser extends RegisteredUser{
	
	//1.mainigie
	private ArrayList<Page> allPages = new ArrayList<Page>();
	
	
	//2.getters
	public ArrayList<Page> getAllPages() {
		return allPages;
	}

	//3.setters - nav nepieciesams, jo nelausu pievienot sarakstu ar lapam

	//4. abi konstruktori
	public BusinessUser() {
		//seit neizsaucu super() apzinati, jo negribu, ka Privateuser noklusejuma objekts ir vienads ar BusinessUser nosklusejuma objektu
		setId();
		setUsername("ziedi");
		setPassword("123456");
	}
	
	public BusinessUser(String inputUsername, String inputPassword) {
		super(inputUsername, inputPassword);
	}

	
	public String toString() {
		return super.toString() + " ->" + allPages;
	}
	
	@Override
	public void createAndPublishPost(String inputMsg, PostType inputPostType) {
		Random rand = new Random();
		allPages.get(rand.nextInt(0, allPages.size())).getAllPostsInPage().add(new Post(inputMsg));
		
	}

}
