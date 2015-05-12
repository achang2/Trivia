/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
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
    private Label question;
    
    @FXML
    private button newGame;
            
    private Label a;
    
    @FXML
    private Label b;
    
    @FXML
    private Label c;
    
    @FXML
    private Label d;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @Override
    public void setScreenParent(ScreensController screenParent){ 
        myController = screenParent; 
    } 
    
}
