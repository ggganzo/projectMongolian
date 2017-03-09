package business;

public abstract class Resource {

	private int resourceId;
	private boolean available;
	private int type;
	private String isbn;

	public Resource(int resourceId, int type, String isbn) {
		this.resourceId = resourceId;
		this.available = true;
		this.type = type;
		this.setIsbn(isbn);
	}

	public String toString() {
		// TODO - implement Resource.toString
		throw new UnsupportedOperationException();
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean getAvailable() {
		return this.available;
	}

	public int getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(int type) {
		this.type = type;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}