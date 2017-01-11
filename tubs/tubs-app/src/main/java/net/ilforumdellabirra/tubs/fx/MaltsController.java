package net.ilforumdellabirra.tubs.fx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import net.ilforumdellabirra.tubs.fx.model.Malt;

public class MaltsController implements Initializable {

		@FXML
		private Button btnAdd;
		@FXML
		private Button btnModify;
		@FXML
		private Button btnDelete;
		@FXML
		private TableView<Malt> tblMalt;
		
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
		
		public void addMalt() {
			System.out.println("premuto");
		}


		
		
}
