package business.person.staff;

import java.util.List;

import business.person.staff.task.AdminTasks;
import business.person.staff.task.LibrarianTasks;

public class SuperUser extends Staff {
	private List<AdminTasks> adminTasks;
	private List<LibrarianTasks> librarianTasks;
	public SuperUser(int personId, String firstName, String lastName, String bio, String phone, String email,
			String address, String street, String city, String state, int zip, String ssn, String username,
			String password) {
		super(personId, firstName, lastName, bio, phone, email, address, street, city, state, zip, ssn, username, password);
		// TODO Auto-generated constructor stub
	}

	public List<AdminTasks> getAdminTasks() {
		return adminTasks;
	}

	public void setAdminTasks(List<AdminTasks> adminTasks) {
		this.adminTasks = adminTasks;
	}

	public List<LibrarianTasks> getLibrarianTasks() {
		return librarianTasks;
	}

	public void setLibrarianTasks(List<LibrarianTasks> librarianTasks) {
		this.librarianTasks = librarianTasks;
	}


}