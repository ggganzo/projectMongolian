package application;


import business.ResourceInfo;
import business.person.staff.AdminUser;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import application.Login;

public class resourceInfoController {
	@FXML
	private TextField txtTitle;
	@FXML
	private TextField txtIsbn;
	@FXML
	private TextField txtAuthor;
	@FXML
	private TextField txtAuthorText;
	@FXML
	private TextField txtDescription;
	@FXML
	private TextField txtMaxDay;

	@FXML
	private void saveResourceInfo() {
		ResourceInfo resourceInfo = new ResourceInfo(txtTitle.getText(), txtIsbn.getText(), txtAuthor.getText(),
				txtAuthorText.getText(), txtDescription.getText(), Integer.valueOf(txtMaxDay.getText()));

		if (Login.loginUser instanceof AdminUser) {
			AdminUser admin = (AdminUser) Login.loginUser;
			admin.getAdminTasks().addResourceInfo(resourceInfo);

		}
	}

}
