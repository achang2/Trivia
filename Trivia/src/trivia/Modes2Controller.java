/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Shoshana
 */
public class Modes2Controller extends ControlledScreen implements Initializable {
    private static long startTime;
    public static long endTime;
    
    
    @FXML
    private Label headLine;
    
    @FXML
    private Button Classic;
    
    @FXML
    private Button Timed;
    
    @FXML
    private void handleNewMode(ActionEvent event) {
        Trivia.switchScene();
    }
    
    @FXML
    private void handleNewTimed(ActionEvent event) {
        startTime = System.currentTimeMillis();
        endTime = startTime + 60000;
        Trivia.switchToTimed();
        
    }
    
    public static void newTimed() {
        startTime = System.currentTimeMillis();
        endTime = startTime + 60000;
        Trivia.switchToTimed();
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
