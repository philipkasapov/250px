package picssshare.content;

import picssshare.user.User;

public class VideoPost extends Post{

	private int views;
	
	public VideoPost(User poster, String url) {
		super(poster, url);
		this.views = 0;
	}

}
