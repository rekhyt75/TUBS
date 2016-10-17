package net.ilforumdellabirra.tubs.fx.model;

import java.math.BigDecimal;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import net.ilforumdellabirra.tubs.model.BrewingSystemParameters;

/**
 *
 * @author Peruzzi Alessandro
 */
public final class BrewingSystemParametersFX {

    private final ObjectProperty<BigDecimal> finalVolume;
    private final ObjectProperty<BigDecimal> efficiency;
    private BooleanProperty biab;
    private final ObjectProperty<BigDecimal> exhaustedGrainAbsorption;
    private final ObjectProperty<BigDecimal> waterGrainRatio;
    private final ObjectProperty<BigDecimal> evaporationRate;
    private final ObjectProperty<BigDecimal> coolingContraction;
    private final ObjectProperty<BigDecimal> trubLoss;

    public BrewingSystemParametersFX() {

        this.finalVolume = new SimpleObjectProperty<>();
        this.efficiency = new SimpleObjectProperty<>();
        this.biab = new SimpleBooleanProperty(Boolean.FALSE);
        this.exhaustedGrainAbsorption = new SimpleObjectProperty<>();
        this.waterGrainRatio = new SimpleObjectProperty<>();
        this.evaporationRate = new SimpleObjectProperty<>();
        this.coolingContraction = new SimpleObjectProperty<>();
        this.trubLoss = new SimpleObjectProperty<>();
    }

    public BrewingSystemParametersFX(BrewingSystemParameters parameters) {
        this();
        if (parameters != null) {
            setFinalVolume(parameters.getFinalVolume());
            setEfficiency(parameters.getEfficiency());
            setBiab(parameters.getBiab());

            setExhaustedGrainAbsorption(parameters.getExhaustedGrainAbsorption());
            setWaterGrainRatio(parameters.getWaterGrainRatio());
            setEvaporationRate(parameters.getEvaporationRate());
            setCoolingContraction(parameters.getCoolingContraction());
            setTrubLoss(parameters.getTrubLoss());
        }
    }

    public ObjectProperty<BigDecimal> getFinalVolumeProperty() {
        return finalVolume;
    }

    public BigDecimal getFinalVolume() {
        return finalVolume.get();
    }

    public void setFinalVolume(BigDecimal finalVolume) {
        this.finalVolume.set(finalVolume);
    }

    public ObjectProperty<BigDecimal> getEfficiencyProperty() {
        return efficiency;
    }

    public BigDecimal getEfficiency() {
        return efficiency.get();
    }

    public void setEfficiency(BigDecimal efficiency) {
        this.efficiency.set(efficiency);
    }

    public BooleanProperty getBiabProperty() {
        return biab;
    }

    public Boolean getBiab() {
        return biab.get();
    }

    public void setBiab(Boolean biab) {
        this.biab.setValue(biab);
    }

    public ObjectProperty<BigDecimal> getExhaustedGrainAbsorptionProperty() {
        return exhaustedGrainAbsorption;
    }

    public BigDecimal getExhaustedGrainAbsorption() {
        return exhaustedGrainAbsorption.get();
    }

    public void setExhaustedGrainAbsorption(BigDecimal exhaustedGrainAbsorption) {
        this.exhaustedGrainAbsorption.set(exhaustedGrainAbsorption);
    }

    public ObjectProperty<BigDecimal> getWaterGrainRatioProperty() {
        return waterGrainRatio;
    }

    public BigDecimal getWaterGrainRatio() {
        return waterGrainRatio.get();
    }

    public void setWaterGrainRatio(BigDecimal waterGrainRatio) {
        this.waterGrainRatio.set(waterGrainRatio);
    }

    public ObjectProperty<BigDecimal> getEvaporationRateProperty() {
        return evaporationRate;
    }

    public BigDecimal getEvaporationRate() {
        return evaporationRate.get();
    }

    public void setEvaporationRate(BigDecimal evaporationRate) {
        this.evaporationRate.set(evaporationRate);
    }

    public ObjectProperty<BigDecimal> getCoolingContractionProperty() {
        return coolingContraction;
    }

    public BigDecimal getCoolingContraction() {
        return coolingContraction.get();
    }

    public void setCoolingContraction(BigDecimal coolingContraction) {
        this.coolingContraction.set(coolingContraction);
    }

    public ObjectProperty<BigDecimal> getTrubLossProperty() {
        return trubLoss;
    }

    public BigDecimal getTrubLoss() {
        return trubLoss.get();
    }

    public void setTrubLoss(BigDecimal trubLoss) {
        this.trubLoss.set(trubLoss);
    }

}
