package business.person.staff;

import business.Resource;
import business.person.Person;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

public class Staff extends Person {

	private String ssn;
	private String username;
	private String password;

	public Staff(int personId, String firstName, String lastName, String bio, String phone, String email,
			String address, String street, String city, String state, int zip, String ssn, String username,
			String password) {
		super(personId, firstName, lastName, bio, phone, email, address, street, city, state, zip);
		this.ssn = ssn;
		this.password = password;
		this.username = username;
	}

	public Resource readResource(int resourceId) {
		DataAccess data = DataAccessFacade.getDataAccessFacade();

		return data.readResource(String.valueOf(resourceId));
	}

	public String toString() {
		// TODO - implement Staff.toString
		throw new UnsupportedOperationException();
	}

	public String getSsn() {
		return this.ssn;
	}

	/**
	 * 
	 * @param ssn
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getUsername() {
		return this.username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}