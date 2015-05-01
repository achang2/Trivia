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

/**
 * FXML Controller class
 *
 * @author Arthur
 */
public class WelcomePageController implements Initializable, ControlledScreen {

    /**
     * Initializes the controller class.
     */
    ScreensController myController;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @Override
    public void setScreenParent(ScreensController screenParent) { 
        myController = screenParent; 
    } 

    @FXML
    private void goToHomePage(ActionEvent event) {
        myController.setScreen(Trivia.Home_Page);
        System.out.println("changing screen to home page!");
    }
}
