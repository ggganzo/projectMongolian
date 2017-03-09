package application;

import business.BookInstance;
import business.PeriodicalInstance;
import business.person.staff.AdminUser;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import application.Login;

public class resourceController {
	@FXML
	private TextField txtResourceId;
	@FXML
	private TextField txtIsbn;
	@FXML
	private TextField txtType;

	@FXML
	private DatePicker dateIssueDate;

	@FXML
	private void addResource() {
		AdminUser admin;
		if (Login.loginUser instanceof AdminUser) {
			admin = (AdminUser) Login.loginUser;

			if (txtType.getText().compareTo("0") == 0) {
				// Boook
				BookInstance resource = new BookInstance(Integer.valueOf(txtResourceId.getText()),
						Integer.valueOf(txtType.getText()), txtIsbn.getText());
				admin.getAdminTasks().addBookInstance(resource);
			} else {
				// Magazine
				LocalDate ld = dateIssueDate.getValue();
				Calendar c = Calendar.getInstance();
				c.set(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth());
				Date date = c.getTime();
				PeriodicalInstance resource = new PeriodicalInstance(Integer.valueOf(txtResourceId.getText()),
						Integer.valueOf(txtType.getText()), txtIsbn.getText(), date);
				admin.getAdminTasks().addPeriodicalInstance(resource);
			}
		}

	}
	

}
