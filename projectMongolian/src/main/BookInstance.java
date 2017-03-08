package main;

public class BookInstance extends Resource {

	private int copyId;

	public String toString() {
		// TODO - implement BookInstance.toString
		throw new UnsupportedOperationException();
	}

	public int getCopyId() {
		return this.copyId;
	}

	/**
	 * 
	 * @param copyId
	 */
	public void setCopyId(int copyId) {
		this.copyId = copyId;
	}

}