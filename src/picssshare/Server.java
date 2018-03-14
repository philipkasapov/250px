package picssshare;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashSet;


import picssshare.user.User;

public class Server {

//	public Server() {
//		this.users = new ArrayList<User>();
//	}
	
	public void showUsers() {
		for(Map.Entry<String, User> u: UserLogging.getUsers().entrySet()) {
			System.out.println(u.getValue());
		}
	}

}
