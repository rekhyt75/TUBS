package net.ilforumdellabirra.tubs.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Peruzzi Alessandro
 */
public class BrewingSystemParameters implements Serializable {

	private static final long serialVersionUID = 8600480800503750161L;
	private BigDecimal finalVolume;
	private BigDecimal efficiency;
	private Boolean biab;
	private BigDecimal exhaustedGrainAbsorption;
	private BigDecimal waterGrainRatio;
	private BigDecimal evaporationRate;
	private BigDecimal coolingContraction;
	private BigDecimal trubLoss;

	public BrewingSystemParameters() {
	}

	public BigDecimal getFinalVolume() {
		return finalVolume;
	}

	public void setFinalVolume(BigDecimal finalVolume) {
		this.finalVolume = finalVolume;
	}

	public BigDecimal getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(BigDecimal efficiency) {
		this.efficiency = efficiency;
	}

	public Boolean getBiab() {
		return biab;
	}

	public void setBiab(Boolean biab) {
		this.biab = biab;
	}

	public BigDecimal getExhaustedGrainAbsorption() {
		return exhaustedGrainAbsorption;
	}

	public void setExhaustedGrainAbsorption(BigDecimal exhaustedGrainAbsorption) {
		this.exhaustedGrainAbsorption = exhaustedGrainAbsorption;
	}

	public BigDecimal getWaterGrainRatio() {
		return waterGrainRatio;
	}

	public void setWaterGrainRatio(BigDecimal waterGrainRatio) {
		this.waterGrainRatio = waterGrainRatio;
	}

	public BigDecimal getEvaporationRate() {
		return evaporationRate;
	}

	public void setEvaporationRate(BigDecimal evaporationRate) {
		this.evaporationRate = evaporationRate;
	}

	public BigDecimal getCoolingContraction() {
		return coolingContraction;
	}

	public void setCoolingContraction(BigDecimal coolingContraction) {
		this.coolingContraction = coolingContraction;
	}

	public BigDecimal getTrubLoss() {
		return trubLoss;
	}

	public void setTrubLoss(BigDecimal trubLoss) {
		this.trubLoss = trubLoss;
	}

}
