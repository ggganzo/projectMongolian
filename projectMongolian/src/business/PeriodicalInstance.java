package business;

import java.util.Date;

public class PeriodicalInstance extends Resource {

	public PeriodicalInstance(int resourceId, int type, String isbn, Date issueDate) {
		super(resourceId, type, isbn);
		this.issueDate = issueDate;
	}

	private Date issueDate;

	public String toString() {
		// TODO - implement PeriodicalInstance.toString
		throw new UnsupportedOperationException();
	}

	public Date getIssueDate() {
		return this.issueDate;
	}

	/**
	 * 
	 * @param issueDate
	 */
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

}