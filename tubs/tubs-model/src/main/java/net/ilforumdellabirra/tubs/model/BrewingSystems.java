/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ilforumdellabirra.tubs.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Peruzzi Alessandro
 */
@XmlRootElement(name = "brewingSystems")
public class BrewingSystems {

    private List<BrewingSystem> brewingSystems;

    @XmlElement(name = "brewingSystem")
    public List<BrewingSystem> getBrewingSystems() {
        return brewingSystems;
    }

    public void setBrewingSystems(List<BrewingSystem> brewingSystems) {
        this.brewingSystems = brewingSystems;
    }
    
    
}
