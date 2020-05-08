package edu.wpi.cs3733;

import edu.wpi.cs3733.entity.*;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Cipher application controller; don't modify this file (except for note below)
 */
public class CipherController implements Initializable {

	@FXML
	TextField textInputBox;

	@FXML
	TextArea caesarTextOut;

	@FXML
	TextArea elbonianTextOut;

	private Message cleartext;
	private CaesarCipher caesarCipher;
	private ElbonianCipher elbonianCipher;
	private Subject subject = new Subject();

	public CipherController(){
		cleartext = new Message();
		caesarCipher = new CaesarCipher();
		elbonianCipher = new ElbonianCipher();
		/*
		 * You may add additional code here if it relates to your observer pattern implementation.
		 */

	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		caesarTextOut.textProperty().bind(Bindings.createStringBinding(
				() -> {caesarCipher.setText(subject.getState().get());
					return caesarCipher.getText();
				}, subject.getState()
		));

		elbonianTextOut.textProperty().bind(Bindings.createStringBinding(
				() -> {elbonianCipher.setText(subject.getState().get());
					return elbonianCipher.getText();},
				subject.getState()
		));

		textInputBox.textProperty().addListener((observable, ol, ne) -> {
			if (ne.isBlank()) {
				subject.setState("");
			} else {
				subject.setState(ne);
			}
		});
	}

	/**
	 * Runs once every time the text in the input box changes. Your observer pattern implementation should allow
	 * for the text contained inside the different cipher objects to change despite that their setText() functions are
	 * never explicitly called here.
	 */
	@FXML
	public void onTextUpdate(){
		cleartext.setText(textInputBox.getText());
	}

	/**
	 * Runs when the user clicks the 'Encode!' button
	 */
	@FXML
	public void updateOutput(){
		caesarTextOut.setText(caesarCipher.getText());
		elbonianTextOut.setText(elbonianCipher.getText());
	}
}
