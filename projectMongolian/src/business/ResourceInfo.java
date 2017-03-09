package business;

public class ResourceInfo {

	private String title;
	private String isbn;
	private String author;
	private String authorText;
	private String description;
	private int maxDay;

	public ResourceInfo(String title, String isbn, String author, String authorText, String description, int maxDay) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.authorText = authorText;
		this.description = description;
		this.maxDay = maxDay;
	}

	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return this.isbn;
	}

	/**
	 * 
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return this.author;
	}

	/**
	 * 
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorText() {
		return this.authorText;
	}

	/**
	 * 
	 * @param authorText
	 */
	public void setAuthorText(String authorText) {
		this.authorText = authorText;
	}

	public String getDescription() {
		return this.description;
	}

	public int getMaxDay() {
		return maxDay;
	}

	public void setMaxDay(int maxDay) {
		this.maxDay = maxDay;
	}

}