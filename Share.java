package InstagramOop1;

public class Share {
	private String post;
	private String story;
	private String reel;
	private String live;
	
	public Share() {
		super();
	}

	public Share(String post, String story, String reel, String live) {
		super();
		this.post = post;
		this.story = story;
		this.reel = reel;
		this.live = live;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getReel() {
		return reel;
	}

	public void setReel(String reel) {
		this.reel = reel;
	}

	public String getLive() {
		return live;
	}

	public void setLive(String live) {
		this.live = live;
	}
	
}
