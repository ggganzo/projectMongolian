package business.person.staff;

import java.util.List;

import business.person.staff.task.AdminTasks;

public class AdminUser extends Staff {

	private AdminTasks adminTasks;

	public AdminUser(int personId, String firstName, String lastName, String bio, String phone, String email,
			String address, String street, String city, String state, int zip, String ssn, String username,
			String password) {
		super(personId, firstName, lastName, bio, phone, email, address, street, city, state, zip, ssn, username,
				password);

	}

	public AdminTasks getAdminTasks() {
		return adminTasks;
	}

	public void setAdminTasks(AdminTasks adminTasks) {
		this.adminTasks = adminTasks;
	}

}