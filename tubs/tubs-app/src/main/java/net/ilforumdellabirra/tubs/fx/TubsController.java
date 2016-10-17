package net.ilforumdellabirra.tubs.fx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import net.ilforumdellabirra.tubs.fx.model.Model;

/**
 * FXML Controller class
 *
 * @author YYE9497
 */
public class TubsController implements Initializable {

    private Model model;
    
    
    @FXML
    MenuItem configBrewingSystem;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("net.ilforumdellabirra.tubs.TubsController.initialize()");
    }

    public void openConfigBrewingSystem() {
        try {
            System.out.println("net.ilforumdellabirra.tubs.TubsController.openConfigBrewingSystem()");
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/brewing-system.fxml"));
            
//         Parent root1 = (Parent) fxmlLoader.load();

//            FXMLLoader loader = new FXMLLoader();
//            
//            InputStream is = getClass().getResourceAsStream("/fxml/brewing-system.fxml");
//            
//            Parent root1 = (Parent) loader.load(getClass().getResourceAsStream("/fxml/brewing-system.fxml"));

            
            
             FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/brewing-system.fxml"));
//        AnchorPane personOverview = (AnchorPane) loader.load();
    
Parent root1 = (Parent) loader.load();
            
            // Give the controller access to the main app.
        BrewingSystemController brewingSystemController = loader.getController();
        brewingSystemController.setModel(model);

            
            
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("Config your brewing sytems");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
           Logger.getLogger(TubsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setModel(Model model) {
        this.model = model;
    }
    
    

}
