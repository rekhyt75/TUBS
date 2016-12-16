package net.ilforumdellabirra.tubs.model.registry;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Fermentable implements Serializable {

	private static final long serialVersionUID = -322348437021927019L;

	protected String name;
	protected BigInteger version;
	protected String type;
	protected BigDecimal amount;
	protected BigInteger yield;
	protected BigDecimal color;
	protected String addafterboil;
	protected String origin;
	protected Object supplier;
	protected String notes;
	protected BigDecimal coarsefinediff;
	protected BigInteger moisture;
	protected BigInteger diastaticpower;
	protected BigDecimal protein;
	protected BigInteger maxinbatch;
	protected String recommendmash;
	protected BigInteger ibugalperlb;
	protected String displayamount;
	protected String inventory;
	protected BigDecimal potential;
	protected String displaycolor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getVersion() {
		return version;
	}

	public void setVersion(BigInteger version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigInteger getYield() {
		return yield;
	}

	public void setYield(BigInteger yield) {
		this.yield = yield;
	}

	public BigDecimal getColor() {
		return color;
	}

	public void setColor(BigDecimal color) {
		this.color = color;
	}

	public String getAddafterboil() {
		return addafterboil;
	}

	public void setAddafterboil(String addafterboil) {
		this.addafterboil = addafterboil;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Object getSupplier() {
		return supplier;
	}

	public void setSupplier(Object supplier) {
		this.supplier = supplier;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getCoarsefinediff() {
		return coarsefinediff;
	}

	public void setCoarsefinediff(BigDecimal coarsefinediff) {
		this.coarsefinediff = coarsefinediff;
	}

	public BigInteger getMoisture() {
		return moisture;
	}

	public void setMoisture(BigInteger moisture) {
		this.moisture = moisture;
	}

	public BigInteger getDiastaticpower() {
		return diastaticpower;
	}

	public void setDiastaticpower(BigInteger diastaticpower) {
		this.diastaticpower = diastaticpower;
	}

	public BigDecimal getProtein() {
		return protein;
	}

	public void setProtein(BigDecimal protein) {
		this.protein = protein;
	}

	public BigInteger getMaxinbatch() {
		return maxinbatch;
	}

	public void setMaxinbatch(BigInteger maxinbatch) {
		this.maxinbatch = maxinbatch;
	}

	public String getRecommendmash() {
		return recommendmash;
	}

	public void setRecommendmash(String recommendmash) {
		this.recommendmash = recommendmash;
	}

	public BigInteger getIbugalperlb() {
		return ibugalperlb;
	}

	public void setIbugalperlb(BigInteger ibugalperlb) {
		this.ibugalperlb = ibugalperlb;
	}

	public String getDisplayamount() {
		return displayamount;
	}

	public void setDisplayamount(String displayamount) {
		this.displayamount = displayamount;
	}

	public String getInventory() {
		return inventory;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public BigDecimal getPotential() {
		return potential;
	}

	public void setPotential(BigDecimal potential) {
		this.potential = potential;
	}

	public String getDisplaycolor() {
		return displaycolor;
	}

	public void setDisplaycolor(String displaycolor) {
		this.displaycolor = displaycolor;
	}

}
