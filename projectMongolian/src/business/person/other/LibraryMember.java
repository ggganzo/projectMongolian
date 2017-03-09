package business.person.other;

import business.person.Person;

import java.util.ArrayList;
import java.util.List;

import business.*;

public class LibraryMember extends Person {

	public LibraryMember(int personId, String firstName, String lastName, String bio, String phone, String email,
			String address, String street, String city, String state, int zip) {
		super(personId, firstName, lastName, bio, phone, email, address, street, city, state, zip);

		checkOutRecord = new ArrayList<CheckOutRecord>();
	}

	private int memberId;
	private List<CheckOutRecord> checkOutRecord;

	public void getCheckOutHistory() {
		// TODO - implement LibraryMember.getCheckOutHistory
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement LibraryMember.toString
		throw new UnsupportedOperationException();
	}

	public int getMemberId() {
		return this.memberId;
	}

	/**
	 * 
	 * @param memberId
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public List<CheckOutRecord> getCheckOutRecord() {
		return checkOutRecord;
	}

	public void setCheckOutRecord(List<CheckOutRecord> checkOutRecord) {
		this.checkOutRecord = checkOutRecord;
	}

	public void addCheckOutRecord(CheckOutRecord checkOutRecord) {
		this.checkOutRecord.add(checkOutRecord);
	}

}