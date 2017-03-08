package main;

import java.util.Date;

public class PeriodicalInstance extends Resource {

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