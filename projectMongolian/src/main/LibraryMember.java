package main;

public class LibraryMember extends Person {

	private int memberId;

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

}