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
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/**
 *
 * @author Arthur
 */
public class HomePageController implements Initializable, ControlledScreen {
    
    ScreensController myController;
    
    @FXML
    private Label label;
    @FXML
    private Button newGame;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @Override
    public void setScreenParent(ScreensController screenParent){ 
        myController = screenParent; 
    } 
    
}
