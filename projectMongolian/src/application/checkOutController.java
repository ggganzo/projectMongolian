package application;

import business.CheckOutRecord;
import business.Resource;
import business.person.staff.LibrarianUser;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import application.Login;

public class checkOutController {
	@FXML
	private TextField txtResourceId;

	@FXML
	private void addResource() {
		LibrarianUser user;
		if (Login.loginUser instanceof LibrarianUser) {

			user = (LibrarianUser) Login.loginUser;

			Resource resource = Login.loginUser.readResource(Integer.valueOf(txtResourceId.getText()));
			CheckOutRecord record = new CheckOutRecord(resource);

			user.getLibrarianTasks().checkOut(record);
		}

	}

}
