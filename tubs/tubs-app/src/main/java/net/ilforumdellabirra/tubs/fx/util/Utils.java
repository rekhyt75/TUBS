/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ilforumdellabirra.tubs.fx.util;

import java.math.BigDecimal;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.util.Duration;

/**
 *
 * @author Peruzzi Alessandro
 */
public class Utils {

    public static void setProgressBarValue(ProgressBar bar, Label labelValue, BigDecimal newValue) {

        Timeline task = new Timeline(
                new KeyFrame(
                        Duration.ZERO,
                        new KeyValue(bar.progressProperty(), bar.getProgress())
                ),
                new KeyFrame(
                        Duration.seconds(0.25),
                        new KeyValue(bar.progressProperty(), newValue != null ? newValue.divide(new BigDecimal(100)) : 0)
                )
        );
       
        task.playFromStart();
        
        labelValue.setText(newValue != null ? newValue + " %" : "0 %");
    }
    
    public static void setSliderValue(Slider slider, Label labelValue, BigDecimal newValue) {

        Timeline task = new Timeline(
                new KeyFrame(
                        Duration.ZERO,
                        new KeyValue(slider.valueProperty(), slider.getValue())
                ),
                new KeyFrame(
                        Duration.seconds(0.25),
                        new KeyValue(slider.valueProperty(), newValue != null ? newValue : 0)
                )
        );
       
        task.playFromStart();
        

    }
    
    public static void setSliderValue(Slider slider, Label sliderValue)
    {
        sliderValue.setText(String.format("%.1f", slider.getValue()) + " %");
    }
            
}
