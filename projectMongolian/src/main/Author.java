package main;

public class Author extends Person {

	private String credentials;

	public String toString() {
		// TODO - implement Author.toString
		throw new UnsupportedOperationException();
	}

	public String getCredentials() {
		return this.credentials;
	}

	/**
	 * 
	 * @param credentials
	 */
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

}