package picssshare;

import java.util.ArrayList;

import demo.Demo;

public class User {
		
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private ArrayList<User> subscriptions;
	private ArrayList<Post> posts;
	private Feed feed;
	private ArrayList<Content> likedPhotos;
	private ArrayList<Content> bookmarks;
	//server would proceed requests like login and register and would have info about all the users
	private Server server;
	
	

	public User(String username, String password, String firstName, String lastName, String email) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public void registerRequest() {
		server.register(this.username,this.password,this.firstName,this.lastName, this.email);
	}
	
	public void loginRequest() {
		if(this.server.login(this)) {
			System.out.println(this.username+" successfully logged.");
		}
		else {
			System.out.println("Login operation unsuccessfull.");
		}
	}
	
	//=====================GETTERS AND SETTERS===============//
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setServer(Server server) {
		this.server = server;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	//=====================================================//

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	

}
