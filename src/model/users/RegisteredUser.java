package model.users;

import java.security.MessageDigest;

public class RegisteredUser extends GuestUser{
	//1.mainigie
	private String username;
	private String password;
	
	
	//2.getters
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}

	
	//3.setters
	public void setUsername(String inputUsername) {
		if(inputUsername != null && !inputUsername.isEmpty() 
				&& inputUsername.matches("[A-Za-z0-9]{4,20}")) {
			username = inputUsername;
		}
		else
		{
			username = "DefaultUser";
		}
	}
	//Regex maska parolei no : https://uibakery.io/regex-library/password
	public void setPassword(String inputPassword) {
		if(inputPassword != null && !inputPassword.isEmpty() && inputPassword.matches("/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/")) {
		try
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(inputPassword.getBytes());
			password = md.digest().toString();
		}
		catch (Exception e) {
			password = "0000";
		}
		}
		else
		{
			password = "0000";
		}
	}

	//4.abi konstruktori
		
	public RegisteredUser() {
		super();//te izsaucas GuestUser bezargumenta konstruktors
		setUsername("karina.skirmante");
		setPassword("As1@aaaa");
	}
	
	public RegisteredUser(String inputUsername, String inputPassword) {
		super();//te izsaucas GuestUser bezargumenta konstruktors
		setUsername(inputUsername);
		setPassword(inputPassword);
	}
	//5.toString
	public String toString() {
		String result = id + ": " + username + " " + password;
		return result;
	}
	//6.parejas funkcijas

}
