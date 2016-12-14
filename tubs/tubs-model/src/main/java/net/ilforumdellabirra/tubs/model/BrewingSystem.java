/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ilforumdellabirra.tubs.model;

import java.io.Serializable;

/**
 *
 * @author Peruzzi Alessandro
 */
public class BrewingSystem implements Serializable {

	private static final long serialVersionUID = -2888900094001915868L;
	private String name;
	private String description;
	private BrewingSystemParameters parameters;

	public BrewingSystem() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BrewingSystemParameters getParameters() {
		return parameters;
	}

	public void setParameters(BrewingSystemParameters parameters) {
		this.parameters = parameters;
	}

}
