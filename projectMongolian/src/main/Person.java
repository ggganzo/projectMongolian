package main;

public class Person {

	private String firstName;
	private String lastName;
	private String bio;
	private String phone;
	private String email;
	private String address;
	private String street;
	private String city;
	private String state;
	private int zip;

	public String toString() {
		// TODO - implement Person.toString
		throw new UnsupportedOperationException();
	}

	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBio() {
		return this.bio;
	}

	/**
	 * 
	 * @param bio
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getPhone() {
		return this.phone;
	}

	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getStreet() {
		return this.street;
	}

	/**
	 * 
	 * @param street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return this.zip;
	}

	/**
	 * 
	 * @param zip
	 */
	public void setZip(int zip) {
		this.zip = zip;
	}

}