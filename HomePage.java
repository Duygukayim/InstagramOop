package InstagramOop1;

public class HomePage extends Page {
	
	private ProfilePage [] profile;
	private StorePage [] store;
	private ReelsPage [] reels;
	private SearchPage [] search;
	private Dm [] dm;
	private Share [] share;
	private Activity [] activity;
	private String [] storyImages;
	
	public  HomePage() {
		super();
	}

	public HomePage(ProfilePage[] profile, StorePage[] store, ReelsPage[] reels, SearchPage[] search, Dm[] dm,
			Share[] share, Activity[] activity, String[] storyImages, String pageName) {
		super(pageName);
		this.profile = profile;
		this.store = store;
		this.reels = reels;
		this.search = search;
		this.dm = dm;
		this.share = share;
		this.activity = activity;
		this.storyImages = storyImages;
	}

	public ProfilePage[] getProfile() {
		return profile;
	}

	public void setProfile(ProfilePage[] profile) {
		this.profile = profile;
	}

	public StorePage[] getStore() {
		return store;
	}

	public void setStore(StorePage[] store) {
		this.store = store;
	}

	public ReelsPage[] getReels() {
		return reels;
	}

	public void setReels(ReelsPage[] reels) {
		this.reels = reels;
	}

	public SearchPage[] getSearch() {
		return search;
	}

	public void setSearch(SearchPage[] search) {
		this.search = search;
	}

	public Dm[] getDm() {
		return dm;
	}

	public void setDm(Dm[] dm) {
		this.dm = dm;
	}

	public Share[] getShare() {
		return share;
	}

	public void setShare(Share[] share) {
		this.share = share;
	}

	public Activity[] getActivity() {
		return activity;
	}

	public void setActivity(Activity[] activity) {
		this.activity = activity;
	}

	public String[] getStoryImages() {
		return storyImages;
	}

	public void setStoryImages(String[] storyImages) {
		this.storyImages = storyImages;
	}
	
}
