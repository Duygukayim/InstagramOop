package InstagramOop1;

public class ReelsPage extends Page {
	
	private String video;
	private String senderName;
	private String description;
	private String music;
	private String effect;
	private int likes;
	private int comments;
	private String dm;
	
	public ReelsPage() {
		super();
	}

	public ReelsPage(String video, String senderName, String description, String music, String effect, int likes,
			int comments, String dm, String pageName) {
		super(pageName);
		this.video = video;
		this.senderName = senderName;
		this.description = description;
		this.music = music;
		this.effect = effect;
		this.likes = likes;
		this.comments = comments;
		this.dm = dm;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public String getDm() {
		return dm;
	}

	public void setDm(String dm) {
		this.dm = dm;
	}
	
	

}
