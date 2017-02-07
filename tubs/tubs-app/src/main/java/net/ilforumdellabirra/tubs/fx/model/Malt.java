package net.ilforumdellabirra.tubs.fx.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class Malt {
	
	private StringProperty  name;
	private StringProperty  shape;
	private StringProperty  category;
	
	public Malt() {
	}

	public Malt(String name, String shape, String category) {
		this.name = new SimpleStringProperty(name);
		this.shape = new SimpleStringProperty(shape);
		this.category = new SimpleStringProperty(category);
	}

	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name.set(name);
	}
	
    public StringProperty nameProperty() {
        return name;
    }
	
    public String getShape() {
		return shape.get();
	}
	public void setShape(String shape) {
		this.shape.set(shape);
	}
	
	public StringProperty shapeProperty() {
		return shape;
	}
	
	public String getCategory() {
		return category.get();
	}
	public void setCategory(String category) {
		this.category.set(category);
	}
	
	public StringProperty categoryProperty() {
		return category;
	}
	
}
