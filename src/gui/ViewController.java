package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btnClick;
	
	@FXML
	public void onbtnClickAction() {
		System.out.println("Click");
	}
}