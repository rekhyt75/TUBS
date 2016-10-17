/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ilforumdellabirra.tubs.fx;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import jfxtras.labs.scene.control.BigDecimalField;
import net.ilforumdellabirra.tubs.fx.model.BrewingSystemFX;
import net.ilforumdellabirra.tubs.fx.model.BrewingSystemParametersFX;
import net.ilforumdellabirra.tubs.fx.model.Model;
import net.ilforumdellabirra.tubs.fx.util.Utils;

/**
 * FXML Controller class
 *
 * @author yye9497
 */
public class BrewingSystemController implements Initializable {

    @FXML
    private TableView<BrewingSystemFX> brewingSystemTable;

    @FXML
    private TableColumn<BrewingSystemFX, String> nameColumn;

    @FXML
    private TextField name;

    @FXML
    private TextField description;

    @FXML
    private BigDecimalField finalVolume;

    @FXML
    private Slider efficiency;

    @FXML
    private Label efficiencyValue;

    @FXML
    private CheckBox biab;

    @FXML
    private BigDecimalField exhaustedGrainAbsorption;

    @FXML
    private ProgressBar waterGrainRatio;

    @FXML
    private Label waterGrainRatioValue;

    @FXML
    private ProgressBar evaporationRate;

    @FXML
    private Label evaporationRateValue;

    @FXML
    private ProgressBar coolingContraction;

    @FXML
    private Label coolingContractionValue;

    @FXML
    private BigDecimalField trubLoss;

    // Reference to the model.
    private Model model;

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        finalVolume.setStepwidth(BigDecimal.TEN);
        finalVolume.setMinValue(BigDecimal.ZERO);

        nameColumn.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());

        efficiency.valueProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            Utils.setSliderValue(efficiency, efficiencyValue);
        });
        
        
        
        // Clear person details.
        showBrewingSystemDetails(null);

        // Listen for selection changes and show the person details when changed.
        brewingSystemTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showBrewingSystemDetails(newValue));
        
        
        

    }

    /**
     * Is called by the main application to give a reference back to itself.
     *
     * @param model
     */
    public void setModel(Model model) {
        this.model = model;
        if (model != null) {
            this.brewingSystemTable.setItems(this.model.getBrewingSystemData());
        }
    }

    private void showBrewingSystemDetails(BrewingSystemFX brewingSystem) {
        if (brewingSystem != null) {
            // Fill the labels with info from the person object.
            name.setText(brewingSystem.getName());
            description.setText(brewingSystem.getDescription());

            BrewingSystemParametersFX parameters = brewingSystem.getParameters();

            if (parameters != null) {
                finalVolume.setNumber(parameters.getFinalVolume());
                Utils.setSliderValue(efficiency, efficiencyValue, parameters.getEfficiency());
                biab.setSelected(parameters.getBiab());
                exhaustedGrainAbsorption.setNumber(parameters.getExhaustedGrainAbsorption());
                Utils.setProgressBarValue(waterGrainRatio, waterGrainRatioValue, parameters.getWaterGrainRatio());
                Utils.setProgressBarValue(evaporationRate, evaporationRateValue, parameters.getEvaporationRate());
                Utils.setProgressBarValue(coolingContraction, coolingContractionValue, parameters.getCoolingContraction());
                trubLoss.setNumber(parameters.getTrubLoss());
            }
            // TODO: We need a way to convert the birthday into a String!
            // birthdayLabel.setText(...);
        } else {
            // Person is null, remove all the text.
            name.setText("");
            description.setText("");
            finalVolume.setNumber(null);
            biab.setSelected(Boolean.FALSE);
        }

    }

}
