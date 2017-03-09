package business.person.staff.task;

import business.CheckOutRecord;
import business.Resource;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

public class LibrarianTasks {

	public void checkOut(CheckOutRecord record) {

		DataAccess data = DataAccessFacade.getDataAccessFacade();

		data.addRecord(String.valueOf(record.getResource().getResourceId()), record);
		

	}

	public void checkIn() {
		// TODO - implement LibrarianTasks.checkIn
		throw new UnsupportedOperationException();
	}

	public void checkMember() {
		// TODO - implement LibrarianTasks.checkMember
		throw new UnsupportedOperationException();
	}

	public void printOverdue() {
		// TODO - implement LibrarianTasks.printOverdue
		throw new UnsupportedOperationException();
	}

}