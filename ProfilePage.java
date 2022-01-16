package InstagramOop1;

public class ProfilePage extends Page {
	
	private String userName;
	private String bio;
	private String[] postImages;
	private String[] profileImage;
	private Follow[] follow;
	
	public ProfilePage() {
		super();
	}

	public ProfilePage(String pageName, String userName, String bio, String[] postImages, String[] profileImage, Follow[] follow) {
		super(pageName);
		this.userName = userName;
		this.bio = bio;
		this.postImages = postImages;
		this.profileImage = profileImage;
		this.follow = follow;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String[] getPostImages() {
		return postImages;
	}

	public void setPostImages(String[] postImages) {
		this.postImages = postImages;
	}

	public String[] getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String[] profileImage) {
		this.profileImage = profileImage;
	}

	public Follow[] getFollow() {
		return follow;
	}

	public void setFollow(Follow[] follow) {
		this.follow = follow;
	}
	

}
