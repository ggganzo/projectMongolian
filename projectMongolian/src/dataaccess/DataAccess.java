package dataaccess;

import business.*;
import business.person.Person;

public interface DataAccess {
	public void savePerson(String personId, Person data);

	public Person readPerson(String personId);

	public void updatePerson(String personId, Person data);

	public void addResourceInfo(String isbn, ResourceInfo data);

	public ResourceInfo readResourceInfo(String isbn);

	public void updateResourceInfo(String isbn, ResourceInfo data);

	public void addResource(String resourceId, Resource data);

	public Resource readResource(String resourceId);

	public void updateResource(String resourceId, Resource data);

	public void addRecord(String recordId, CheckOutRecord checkOutRecord);

	public void updateRecord(String recordId, CheckOutRecord checkOutRecord);

}
