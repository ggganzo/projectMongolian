package main;

import java.util.Date;

public class CheckOutRecord {

	private Date dueDate;
	private Date checkOutDate;
	private Date checkInDate;
	private double fineAmount;
	private Date finedDate;

	public Date getDueDate() {
		return this.dueDate;
	}

	/**
	 * 
	 * @param dueDate
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getCheckOutDate() {
		return this.checkOutDate;
	}

	/**
	 * 
	 * @param checkOutDate
	 */
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Date getCheckInDate() {
		return this.checkInDate;
	}

	/**
	 * 
	 * @param checkInDate
	 */
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public double getFineAmount() {
		return this.fineAmount;
	}

	/**
	 * 
	 * @param fineAmount
	 */
	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}

	public Date getFinedDate() {
		return this.finedDate;
	}

	/**
	 * 
	 * @param finedDate
	 */
	public void setFinedDate(Date finedDate) {
		this.finedDate = finedDate;
	}

}