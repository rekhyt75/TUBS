package net.ilforumdellabirra.tubs.fx.custom;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

/**
 *
 * @author Peruzzi Alessandro
 */
public class TubsSliderControl extends UserControl {

    @FXML
    private Slider slider;
    @FXML
    private Label valueLabel;
    
    public TubsSliderControl()
    {
//        this.valueLabel.textProperty().bind(String.format("%.2f", this.slider.getValue() + " %"));
    }
}
