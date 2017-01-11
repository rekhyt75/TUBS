package net.ilforumdellabirra.tubs.fx;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
			try {
				System.out.println("net.ilforumdellabirra.tubs.fx.MaltsController.addMalt()");
				FXMLLoader loader = new FXMLLoader();
				loader.setResources(ResourceBundle.getBundle("bundle.project", Locale.getDefault()));
				loader.setLocation(getClass().getResource("/fxml/malt.fxml"));
				Parent root1 = (Parent) loader.load();
				
				//MaltsController maltsController = loader.getController();
      // maltsController.initialize(location, resources);
				
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.initStyle(StageStyle.DECORATED);
				stage.setTitle(loader.getResources().getString("title.listMalts"));
				stage.setScene(new Scene(root1));
				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		
		
}
