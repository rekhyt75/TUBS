package net.ilforumdellabirra.tubs.fx;

import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import net.ilforumdellabirra.tubs.core.ModelReader;
import net.ilforumdellabirra.tubs.fx.model.BrewingSystemFX;
import net.ilforumdellabirra.tubs.fx.model.Model;
import net.ilforumdellabirra.tubs.model.BrewingSystem;

/**
 *
 * @author Peruzzi Alessandro
 */
public class TubsApp extends Application {

    private static final Logger LOG = LoggerFactory.getLogger(MainApp.class);

    private Model model;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        LOG.info("Starting TUBS JavaFX and demonstration application");

        loadData();
        
        
        String fxmlFile = "/fxml/tubs.fxml";
        LOG.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        
        TubsController tubsController = loader.getController();
        tubsController.setModel(model);


        LOG.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode, 400, 200);
        scene.getStylesheets().add("/styles/tubs.css");

        stage.setTitle("TUBS - The Ultimate Brewing System");
        stage.setScene(scene);

        stage.show();
    }

    private void loadData() {
        this.model = new Model();
        
        ModelReader reader = new ModelReader();
        List<BrewingSystem> brewingSystemList = reader.readBrewingSystemList();
        
        brewingSystemList.stream().forEach((brewingSystem) -> {
            model.getBrewingSystemData().add(new BrewingSystemFX(brewingSystem));
        });
        
 
    }

    

}
