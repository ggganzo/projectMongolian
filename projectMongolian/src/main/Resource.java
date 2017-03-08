package main;

public abstract class Resource {

	private boolean available;
	private int type;


	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void makeAvailable() {
		// TODO - implement Resource.makeAvailable
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Resource.toString
		throw new UnsupportedOperationException();
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

}