package business.person.staff;

import business.person.staff.task.LibrarianTasks;

public class LibrarianUser extends Staff {

	private LibrarianTasks librarianTasks;

	public LibrarianUser(int personId, String firstName, String lastName, String bio, String phone, String email,
			String address, String street, String city, String state, int zip, String ssn, String username,
			String password) {
		super(personId, firstName, lastName, bio, phone, email, address, street, city, state, zip, ssn, username,
				password);

	}

	public LibrarianTasks getLibrarianTasks() {
		return librarianTasks;
	}

	public void setLibrarianTasks(LibrarianTasks librarianTasks) {
		this.librarianTasks = librarianTasks;
	}

}