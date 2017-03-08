package main;

public class Staff extends Person {

	private String ssn;
	private String username;
	private String password;

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