package business.person.staff.task;

import business.BookInstance;
import business.PeriodicalInstance;
import business.ResourceInfo;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

public class AdminTasks {

	public void addResourceInfo(ResourceInfo resourceInfo) {

		DataAccess data = DataAccessFacade.getDataAccessFacade();

		data.addResourceInfo(resourceInfo.getIsbn(), resourceInfo);

	}

	public void editResourceInfo(ResourceInfo resourceInfo) {
		DataAccess data = DataAccessFacade.getDataAccessFacade();

		data.updateResourceInfo(resourceInfo.getIsbn(), resourceInfo);
	}

	public void removeResourceInfo(ResourceInfo resourceInfo) {
		// TODO - implement AdminTasks.removeResourceInfo
		throw new UnsupportedOperationException();
	}

	public void addBookInstance(BookInstance resource) {
		DataAccess data = DataAccessFacade.getDataAccessFacade();

		data.addResource(String.valueOf(resource.getResourceId()), resource);
	}

	public void editBookInstance(BookInstance resource) {
		DataAccess data = DataAccessFacade.getDataAccessFacade();

		data.updateResource(String.valueOf(resource.getResourceId()), resource);
	}

	public void removeBookInstance(BookInstance resource) {
		// TODO - implement AdminTasks.removeBookInstance
		throw new UnsupportedOperationException();
	}

	public void addPeriodicalInstance(PeriodicalInstance resource) {
		DataAccess data = DataAccessFacade.getDataAccessFacade();

		data.addResource(String.valueOf(resource.getResourceId()), resource);
	}

	public void editPeriodicalInstance(PeriodicalInstance resource) {
		DataAccess data = DataAccessFacade.getDataAccessFacade();

		data.updateResource(String.valueOf(resource.getResourceId()), resource);
	}

	public void removePeriodicalInstance(PeriodicalInstance resource) {
		// TODO - implement AdminTasks.removePeriodicalInstance
		throw new UnsupportedOperationException();
	}

	public void addMember() {
		// TODO - implement AdminTasks.addMember
		throw new UnsupportedOperationException();
	}

	public void editMember() {
		// TODO - implement AdminTasks.editMember
		throw new UnsupportedOperationException();
	}

	public void removeMember() {
		// TODO - implement AdminTasks.removeMember
		throw new UnsupportedOperationException();
	}

}