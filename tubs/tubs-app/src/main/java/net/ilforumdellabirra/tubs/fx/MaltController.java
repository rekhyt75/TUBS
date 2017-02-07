package net.ilforumdellabirra.tubs.fx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import net.ilforumdellabirra.tubs.fx.model.Malt;

public class MaltController implements Initializable {
		 
	@FXML
	TextField edtMaltName;
	@FXML
	TextField edtMaltShape;
	@FXML
	TextField edtMaltCategory;
	@FXML
	Button btnClose;
	@FXML
	Button btnSave; 
	
	private Malt malt;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void AddMalt() {
		malt = new Malt(edtMaltName.getText(),edtMaltShape.getText(),edtMaltCategory.getText());
		Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
	}
	
	public void CloseForm() {
		Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
	}
	
	public Malt getNewMalt() {
		return malt;
	}

}
