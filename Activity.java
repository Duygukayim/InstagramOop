package InstagramOop1;

public class Activity extends Page {
	
	private String followRequests;
	private String thisWeek;
	private String thisMonth;
	private String suggestedForYou;
	
	public Activity() {
		super();
	}

	public Activity(String pageName, String followRequests, String thisWeek, String thisMonth, String suggestedForYou) {
		super(pageName);
		
		this.followRequests = followRequests;
		this.thisWeek = thisWeek;
		this.thisMonth = thisMonth;
		this.suggestedForYou = suggestedForYou;
	}

	public String getFollowRequests() {
		return followRequests;
	}

	public void setFollowRequests(String followRequests) {
		this.followRequests = followRequests;
	}

	public String getThisWeek() {
		return thisWeek;
	}

	public void setThisWeek(String thisWeek) {
		this.thisWeek = thisWeek;
	}

	public String getThisMonth() {
		return thisMonth;
	}

	public void setThisMonth(String thisMonth) {
		this.thisMonth = thisMonth;
	}

	public String getSuggestedForYou() {
		return suggestedForYou;
	}

	public void setSuggestedForYou(String suggestedForYou) {
		this.suggestedForYou = suggestedForYou;
	}
	
}
