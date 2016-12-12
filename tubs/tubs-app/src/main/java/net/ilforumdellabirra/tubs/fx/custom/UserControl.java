package net.ilforumdellabirra.tubs.fx.custom;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.Region;
import net.ilforumdellabirra.tubs.fx.MainApp;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Peruzzi Alessandro
 */
public abstract class UserControl extends Region {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(MainApp.class);

    private final String resourcePath = "%s.fxml";

    public UserControl() {
        this.loadFXML();
    }

    private void loadFXML() {
        FXMLLoader loader = new FXMLLoader();

        loader.setController(this);
        loader.setLocation(this.getViewURL());

        try {
            Node root = (Node) loader.load();
            this.getChildren().add(root);
        } catch (IOException ex) {
            LOG.error(ex.getMessage(), ex);
        }
    }

    private String getViewPath() {
        return String.format(resourcePath, this.getClass().getSimpleName());
    }

    private URL getViewURL() {
        return this.getClass().getResource(this.getViewPath());
    }

    @Override
    protected void layoutChildren() {
        for (Node node : getChildren()) {
            layoutInArea(node, 0, 0, getWidth(), getHeight(), 0, HPos.LEFT, VPos.TOP);
        }
    }

    private void setMaxSize(Node node) {
        if (node != null && node instanceof Region) {
            Region region = (Region) node;
            region.setMaxWidth(Double.MAX_VALUE);
            region.setMaxHeight(Double.MAX_VALUE);
        }
    }

}
