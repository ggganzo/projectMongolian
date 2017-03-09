package dataaccess;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import business.*;
import business.person.Person;

public final class DataAccessFacade implements DataAccess {
	public static final String OUTPUT_DIR = System.getProperty("user.dir")
			+ "\\src\\projectstartup\\librarysample\\dataaccess\\storage";
	public static final String DATE_PATTERN = "MM/dd/yyyy";

	private static DataAccessFacade dataAccessFacade = new DataAccessFacade();

	public static DataAccessFacade getDataAccessFacade() {
		return dataAccessFacade;
	}

	private void saveData(String id, String pPath, Object o) {
		ObjectOutputStream out = null;
		try {

			Path path = FileSystems.getDefault().getPath(pPath, id);
			out = new ObjectOutputStream(Files.newOutputStream(path));
			out.writeObject(o);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
				}
			}
		}
	}

	public Object readData(String name, String pPath) {
		ObjectInputStream in = null;
		Object o = null;
		try {
			Path path = FileSystems.getDefault().getPath(pPath, name);
			in = new ObjectInputStream(Files.newInputStream(path));
			o = in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
				}
			}
		}
		return o;
	}

	// PERSON
	@Override
	public void savePerson(String personId, Person data) {

		saveData(personId, OUTPUT_DIR + "\\Person", data);
	}

	@Override
	public Person readPerson(String personId) {

		return (Person) readData(personId, OUTPUT_DIR + "\\Person");
	}

	@Override
	public void updatePerson(String personId, Person data) {
		// TODO Auto-generated method stub

		Object o = readData(personId, OUTPUT_DIR + "\\Person");

		if (o != null) {
			saveData(personId, OUTPUT_DIR + "\\Person", data);
		}

	}

	// RESOURCEINFO
	@Override
	public void addResourceInfo(String isbn, ResourceInfo data) {
		saveData(isbn, OUTPUT_DIR + "\\Person", data);

	}

	@Override
	public ResourceInfo readResourceInfo(String isbn) {
		return (ResourceInfo) readData(isbn, OUTPUT_DIR + "\\ResourceInfo");
	}

	@Override
	public void updateResourceInfo(String isbn, ResourceInfo data) {
		// TODO Auto-generated method stub

		Object o = readData(isbn, OUTPUT_DIR + "\\ResourceInfo");

		if (o != null) {
			saveData(isbn, OUTPUT_DIR + "\\ResourceInfo", data);
		}

	}

	// RESOURCE
	@Override
	public void addResource(String isbn, Resource data) {
		saveData(isbn, OUTPUT_DIR + "\\Resource", data);

	}

	@Override
	public Resource readResource(String isbn) {
		return (Resource) readData(isbn, OUTPUT_DIR + "\\Resource");
	}

	@Override
	public void updateResource(String isbn, Resource data) {
		// TODO Auto-generated method stub

		Object o = readData(isbn, OUTPUT_DIR + "\\Resource");

		if (o != null) {
			saveData(isbn, OUTPUT_DIR + "\\Resource", data);
		}

	}

	// RECORD
	@Override
	public void addRecord(String recordId, CheckOutRecord data) {
		saveData(recordId, OUTPUT_DIR + "\\Record", data);

	}

	@Override
	public void updateRecord(String recordId, CheckOutRecord data) {

		Object o = readData(recordId, OUTPUT_DIR + "\\Record");

		if (o != null) {
			saveData(recordId, OUTPUT_DIR + "\\Resource", data);
		}
	}
	
	

}
