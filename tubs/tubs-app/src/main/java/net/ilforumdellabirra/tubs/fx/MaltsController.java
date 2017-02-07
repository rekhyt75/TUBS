package net.ilforumdellabirra.tubs.fx;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import net.ilforumdellabirra.tubs.fx.model.Malt;

public class MaltsController implements Initializable {
		
		public static final ObservableList<Malt> malts = FXCollections.observableArrayList();		

		@FXML
		private TableColumn<Malt, String> nameColumn;
		@FXML
		private TableColumn<Malt, String> shapeColumn;
		@FXML
		private TableColumn<Malt, String> categoryColumn;
		@FXML
		private Button btnNew;
		@FXML
		private Button btnModify;
		@FXML
		private Button btnDelete;
		@FXML
		private TableView<Malt> tblMalt;
		
		public MaltsController() {
	
		}
		
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
			shapeColumn.setCellValueFactory(cellData -> cellData.getValue().shapeProperty());
			categoryColumn.setCellValueFactory(cellData -> cellData.getValue().categoryProperty());
			//tblMalt.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> editMalt(newValue));	
		}
		

		@FXML
		private void newMalt() {
			try {
				System.out.println("net.ilforumdellabirra.tubs.fx.MaltsController.addMalt()");
				FXMLLoader loader = new FXMLLoader();
				loader.setResources(ResourceBundle.getBundle("bundle.project", Locale.getDefault()));
				loader.setLocation(getClass().getResource("/fxml/malt.fxml"));
				Parent root = (Parent) loader.load();
				
				MaltController maltController = loader.getController();
				
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.initStyle(StageStyle.DECORATED);
				stage.setTitle(loader.getResources().getString("title.listMalts"));
				stage.setScene(new Scene(root));
				stage.showAndWait();
				malts.add(maltController.getNewMalt());
				tblMalt.setItems(malts);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		
}
