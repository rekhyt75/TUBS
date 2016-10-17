/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ilforumdellabirra.tubs.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;
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

            BrewingSystem b2 = new BrewingSystem();
            b2.setName("BIAB");
            b2.setDescription("Impianto BIAB di default");
            BrewingSystemParameters bsp2 = new BrewingSystemParameters();
            bsp2.setBiab(Boolean.TRUE);
            b2.setParameters(bsp2);

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
