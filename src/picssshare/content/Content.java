package picssshare.content;

import picssshare.user.User;

public abstract class Content {
	
	protected int id;
	protected User poster;
	protected String url;
	
	public abstract boolean isPhoto();

}
