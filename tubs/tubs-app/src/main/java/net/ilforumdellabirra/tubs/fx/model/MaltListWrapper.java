package net.ilforumdellabirra.tubs.fx.model;


import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "malts")
public class MaltListWrapper {

	private List<Malt> malts;
	
	@XmlElement(name = "malt")
	public List<Malt> getMalts() {
		return malts;
	}
	
	public void setMalts(List<Malt> malts) {
		this.malts = malts;
	}
}
