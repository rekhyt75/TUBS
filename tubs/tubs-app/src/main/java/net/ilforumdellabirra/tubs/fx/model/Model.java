/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ilforumdellabirra.tubs.fx.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Peruzzi Alessandro
 */
public class Model {

    private ObservableList<BrewingSystemFX> brewingSystemData = FXCollections.observableArrayList();

    public ObservableList<BrewingSystemFX> getBrewingSystemData() {
        return brewingSystemData;
    }

    public void setBrewingSystemData(ObservableList<BrewingSystemFX> brewingSystemData) {
        this.brewingSystemData = brewingSystemData;
    }
    
    
}
