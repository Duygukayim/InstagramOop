package InstagramOop1;

public class Page {
	// Home + Search + Reels + Store + Profile sayfalar�n�n toplam�
	private String pageName;
	
	public Page() {
		super();
	}
	public Page(String pageName) {
		super();
		this.pageName = pageName;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}	
	
	
	
}
