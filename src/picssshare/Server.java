package picssshare;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Map;
=======
import java.util.HashSet;
>>>>>>> 92ff7079e00d9af748c9a126b64b207c82c39183

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
