/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ilforumdellabirra.tubs.fx.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import net.ilforumdellabirra.tubs.model.BrewingSystem;

/**
 *
 * @author Peruzzi Alessandro
 */
public final class BrewingSystemFX {

    private final StringProperty name;
    private final StringProperty description;
    private final ObjectProperty<BrewingSystemParametersFX> parameters;

    public BrewingSystemFX() {
        this.name = new SimpleStringProperty();
        this.description = new SimpleStringProperty();
        this.parameters = new SimpleObjectProperty<>();
    }

    public BrewingSystemFX(BrewingSystem brewingSystem) {
        this();
        if (brewingSystem != null) {
            setName(brewingSystem.getName());
            setDescription(brewingSystem.getDescription());
            setParameters(new BrewingSystemParametersFX(brewingSystem.getParameters()));
        }
    }

    public StringProperty getNameProperty() {
        return this.name;
    }

    public String getName() {
        return this.name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty getDescriptionProperty() {
        return this.description;
    }

    public String getDescription() {
        return this.description.get();
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public ObjectProperty<BrewingSystemParametersFX> getParametersProperty() {
        return this.parameters;
    }

    public BrewingSystemParametersFX getParameters() {
        return this.parameters.get();
    }

    public void setParameters(BrewingSystemParametersFX parameters) {
        this.parameters.set(parameters);
    }

}
