package gui.util;

import javafx.scene.control.TextField;

public class Constraints {

	public static void setTextFieldInteger(TextField txt) {
		// Válida se o novo valor informado é um número inteiro,
		// senão não aceita e substitui pelo valor velho.
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (!newValue.matches("\\d*")) {  // "\\d*" -> expressão regular de número inteiro
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldMaxLength(TextField txt, int max) {
		// Válida se o novo valor informado não é maior que o máximo permitido.
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (!newValue.matches("\\d*([\\.]\\d*)?")) { // "\\d*([\\.]\\d*)?" -> expressão regular de número com ponto flutuante(double)
				txt.setText(oldValue);
			}
		});
	}
}