package main;

import java.util.Date;

public class ResourceInfo {

	private String title;
	private String isbn;
	private String author;
	private String authorText;
	private String description;
	private Date maxDate;

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

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getMaxDate() {
		return this.maxDate;
	}

	/**
	 * 
	 * @param maxDate
	 */
	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

}