package business.person.other;

import business.person.Person;

public class Author extends Person {

	public Author(int personId, String firstName, String lastName, String bio, String phone, String email,
			String address, String street, String city, String state, int zip, String credentials) {
		
		super(personId, firstName, lastName, bio, phone, email, address, street, city, state, zip);
		this.credentials = credentials;
	}

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