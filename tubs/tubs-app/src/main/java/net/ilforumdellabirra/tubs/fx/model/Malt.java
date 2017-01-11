package net.ilforumdellabirra.tubs.fx.model;

import javafx.beans.property.SimpleStringProperty;

public final class Malt {
	
	private final SimpleStringProperty  name;
	private final SimpleStringProperty  shape;
	private final SimpleStringProperty  category;
	
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
	
	
}
