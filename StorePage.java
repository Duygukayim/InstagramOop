package InstagramOop1;

public class StorePage extends Page {

	private String search;
	private String [] productImages;
	private String [] options; // shops,videos,editorsPicks,collections,guides
	
	public StorePage() {
		super();
	}
	
	public StorePage(String pageName, String search, String [] productImages, String [] options) {
		super(pageName);
		this.search = search;
		this.productImages = productImages;
		this.options = options;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String[] getProductImages() {
		return productImages;
	}

	public void setProductImages(String[] productImages) {
		this.productImages = productImages;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	

}
