package demo;

import java.util.Random;

import picssshare.Server;
import picssshare.User;

public class Demo {
	
<<<<<<< HEAD
	public static int getRandomNumber(int range, int startPoint) {
		Random r = new Random();
		return r.nextInt(range)+startPoint;
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		User user = new User("amatrixable", "YesssssBe5!", "Philip", "Kasapov", "amatrixable@gmail.com");
		User user1 = new User("distmist", "heyhey123", "Slovan", "Kaspeev", "slovko@.gmail.com");
		User user2 = new User("peshoO91", "toughpassword123", "Petyr", "Petrov", "peshko@gmail.com");
		User user3 = new User("tigra", "TigaraBe3?", "Tisho", "Petrov", "tishoooooo@gmail.com");
		user.setServer(server);
		user1.setServer(server);
		user2.setServer(server);
		user3.setServer(server);
		
		user.registerRequest();
		user1.registerRequest();
		user2.registerRequest();
		user3.registerRequest();
		
		server.showUsers();
		
		user.loginRequest();
		user1.loginRequest(); //
	}

=======
>>>>>>> e71ab17016c5f06869373f987d139a7552d22da9
}
