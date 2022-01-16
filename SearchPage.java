package InstagramOop1;

public class SearchPage extends Page {
	
	private String search;
	private String [] videos;
	private String [] photos;
	private ReelsPage [] reels;
	
	public SearchPage() {
		super();
	}

	public SearchPage(String search, String[] videos, String[] photos, ReelsPage[] reels) {
		super();
		this.search = search;
		this.videos = videos;
		this.photos = photos;
		this.reels = reels;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String[] getVideos() {
		return videos;
	}

	public void setVideos(String[] videos) {
		this.videos = videos;
	}

	public String[] getPhotos() {
		return photos;
	}

	public void setPhotos(String[] photos) {
		this.photos = photos;
	}

	public ReelsPage[] getReels() {
		return reels;
	}

	public void setReels(ReelsPage[] reels) {
		this.reels = reels;
	}
	
	
}
