/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ilforumdellabirra.tubs.core;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import net.ilforumdellabirra.tubs.model.BrewingSystem;
import net.ilforumdellabirra.tubs.model.BrewingSystemParameters;
import net.ilforumdellabirra.tubs.model.BrewingSystems;

/**
 *
 * @author Peruzzi Alessandro
 */
public class ModelReader {

    private static final String TUBS_HOME = System.getProperty("user.home") + "/.tubs";
    private static final String CONFIG_HOME = TUBS_HOME + "/config";

    public ModelReader() {
        initData();
    }

    private void initData() {

        File tubsHomeDir = new File(TUBS_HOME);
        if (!tubsHomeDir.exists()) {
            tubsHomeDir.mkdirs();
        }

    }

    public List<BrewingSystem> readBrewingSystemList() {
        List<BrewingSystem> brewingSystemsList = new ArrayList<>();
        
        File tubsConfigDir = new File(CONFIG_HOME);
        if (!tubsConfigDir.exists()) {
            tubsConfigDir.mkdirs();
        }

        File brewingSystemFile = new File(CONFIG_HOME + "/config.xml");
        
        if (brewingSystemFile.exists()) {
             BrewingSystems brewingSystems = (BrewingSystems) loadDataFromFile(brewingSystemFile, BrewingSystems.class);
             brewingSystemsList = brewingSystems.getBrewingSystems();
        } else {
            BrewingSystem b1 = new BrewingSystem();
            b1.setName("DEFAULT");
            b1.setDescription("Impianto di default");
            BrewingSystemParameters b1Parameters = new BrewingSystemParameters();
            b1Parameters.setBiab(Boolean.FALSE);
            b1Parameters.setCoolingContraction(BigDecimal.valueOf(4));
            b1Parameters.setEfficiency(BigDecimal.valueOf(75));
            b1Parameters.setEvaporationRate(BigDecimal.valueOf(15));
            b1Parameters.setExhaustedGrainAbsorption(BigDecimal.valueOf(1.4));
            b1Parameters.setFinalVolume(BigDecimal.valueOf(23));
            b1Parameters.setTrubLoss(BigDecimal.valueOf(2));
            b1Parameters.setWaterGrainRatio(BigDecimal.valueOf(3));
            b1.setParameters(b1Parameters);

            BrewingSystem b2 = new BrewingSystem();
            b2.setName("BIAB");
            b2.setDescription("Impianto BIAB di default");
            BrewingSystemParameters b2Parameters = new BrewingSystemParameters();
            b2Parameters.setBiab(Boolean.TRUE);
            b2Parameters.setCoolingContraction(BigDecimal.valueOf(4));
            b2Parameters.setEfficiency(BigDecimal.valueOf(75));
            b2Parameters.setEvaporationRate(BigDecimal.valueOf(15));
            b2Parameters.setExhaustedGrainAbsorption(BigDecimal.valueOf(1.4));
            b2Parameters.setFinalVolume(BigDecimal.valueOf(23));
            b2Parameters.setTrubLoss(BigDecimal.valueOf(2));
            b2Parameters.setWaterGrainRatio(BigDecimal.valueOf(3));
            b2.setParameters(b2Parameters);

            brewingSystemsList.add(b1);
            brewingSystemsList.add(b2);

            BrewingSystems brewingSystems = new BrewingSystems();
            brewingSystems.setBrewingSystems(brewingSystemsList);

            saveDataToFile(brewingSystemFile, brewingSystems);
        }
        
        return brewingSystemsList;
    }

    public void saveDataToFile(File file, Object obj) {
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Marshalling and saving XML to the file.
            m.marshal(obj, file);

            // Save the file path to the registry.
//            setPersonFilePath(file);
        } catch (Exception e) { // catches ANY exception
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Could not save data");
            alert.setContentText("Could not save data to file:\n" + file.getPath());

            alert.showAndWait();
        }
    }

    public Object loadDataFromFile(File file, Class clazz) {
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller um = context.createUnmarshaller();

            // Reading XML from the file and unmarshalling.
            return um.unmarshal(file);

//        Object wrapper = (Object) um.unmarshal(file);
//
//        retu
//        personData.clear();
//        personData.addAll(wrapper.getPersons());
        } catch (Exception e) { // catches ANY exception
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Could not load data");
            alert.setContentText("Could not load data from file:\n" + file.getPath());

            alert.showAndWait();
        }

        return null;

    }
}
