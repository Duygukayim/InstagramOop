package InstagramOop1;

public class Follow {
	
	private int posts;
	private int followers;
	private int following;
	
	public Follow() {
		super();
	}

	public Follow(int posts, int followers, int following) {
		super();
		this.posts = posts;
		this.followers = followers;
		this.following = following;
	}

	public int getPosts() {
		return posts;
	}

	public void setPosts(int posts) {
		this.posts = posts;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}
}
