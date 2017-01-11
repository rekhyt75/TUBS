package net.ilforumdellabirra.tubs.fx.model;

import javafx.beans.property.SimpleStringProperty;

public final class Malt {
	
	private final SimpleStringProperty  name;
	private final SimpleStringProperty  shape;
	private final SimpleStringProperty  category;
	
	public Malt() {
		this.name = new SimpleStringProperty();
		this.shape = new SimpleStringProperty();
		this.category = new SimpleStringProperty();
	}
	
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name.set(name);
	}
	
	public String getShape() {
		return shape.get();
	}
	public void setShape() {
		
	}
	
	public String getCategory() {
		return category.get();
	}
	public void setCategory(String category) {
		this.category.set(category);
	}
	
}
