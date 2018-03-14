package picssshare;

import java.util.ArrayList;

import picssshare.user.User;

public class Server {

	public static int usersID = 100000;
	ArrayList<User> users;

	public Server() {
		this.users = new ArrayList<User>();
	}
	
	//========================REGISTER PART===================================//

	public void register(User user) {
		boolean correctUsername = false;
		boolean correctPassword = false;
		boolean correctFirstName = false;
		boolean correctLastName = false;
		boolean correctEmail = false;
		
		if(validateUsername(user.getUsername())){
			correctUsername = true;
		}
		else {
			System.out.println("Incorrect username!");
		}
		
		if(validatePassword(user.getPassword())) {
			correctPassword = true;
		}
		else {
			System.out.println("Incorrect password!");
			System.out.println("Please note that the password must contains at least one uppercase letter"
					+ ", one lowercase letter, one digit, one special character and must be at least 8 characters long!");
		}
		
		if(validateFirstName(user.getFirstName())) {
			correctFirstName = true;
		}
		else {
			System.out.println("Incorrect first name!");
		}
		
		if(validateLastName(user.getLastName())) {
			correctLastName = true;
		}
		else {
			System.out.println("Incorrect last name!");
		}
		
		if(validateEmailAddress(user.getEmail())) {
			correctEmail = true;
		}
		else {
			System.out.println("Incorrect email address!");
		}
		
		if(correctUsername && correctPassword && correctFirstName && correctLastName && correctEmail) {
			user.setId(usersID);
			usersID++;
			this.users.add(user);
			System.out.println(user.getUsername() + " has been successfully registered.");
			
		}
	}

	// validate username
	public boolean validateUsername(String username) {
		return (username != null && !username.isEmpty() && username.matches("^[a-zA-Z0-9]+([_ -]?[a-zA-Z0-9])*$"))
				? true
				: false;
	}

	/*
	 * This regex will enforce these rules for password:
	 * 
	 * At least one upper case English letter, (?=.*?[A-Z])
	 * At least one lower case English letter, (?=.*?[a-z])
	 * At least one digit, (?=.*?[0-9]) 
	 * At least one special character, (?=.*?[#?!@$%^&*-]) 
	 * Minimum eight in length .{8,} (with the anchors)
	 */
	public boolean validatePassword(String password) {
		return (password != null && !password.isEmpty()
				&& password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) ? true : false;
	}

	// validate first name
	public boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z][a-zA-Z]*");
	}

	// validate last name
	public boolean validateLastName(String lastName) {
		return lastName.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
	}

	// validate email address
	public boolean validateEmailAddress(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(email);
		return m.matches();
	}

	//================================================================//
	
	public boolean login(User user) {
		// hashes for complexity/ or sort users by some criteria and use bin search
		for(User u: this.users) {
			if(u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	public void showUsers() {
		for(User u: this.users) {
			System.out.println(u);
		}
	}

}
