package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btnClick;
	
	@FXML
	public void onbtnClickAction() {
		Alerts.showAlert("Alert title", null, "Hello", AlertType.ERROR);
	}
}