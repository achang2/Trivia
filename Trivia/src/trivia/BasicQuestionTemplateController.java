/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

/**
 * FXML Controller class
 *
 * @author Arthur
 */
public class BasicQuestionTemplateController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {     
 // TODO
    }
    public void check(){
        /*this method should check to see if the inputted answer is correct.
        *If the answer is correct, it should call the correct method. 
        *Otherwise, it should call the incorrect method.
        */        
    }
    public void correct(){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Correct!");
        alert.setHeaderText("Correct!");
        alert.setContentText("Congratulations! You got the question correct.");

        ButtonType buttonTypeNext = new ButtonType("Next Question");
        ButtonType buttonTypeBack = new ButtonType("Back to Main");

        alert.getButtonTypes().setAll(buttonTypeNext, buttonTypeBack);

        Optional<ButtonType> result = alert.showAndWait();
        ButtonType buttonTypeOne;
        if (result.get() == buttonTypeNext){
            // switch to the next question page
        } else {
            // switch to the main home page
        } 
    }
    public void incorrect(){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Incorrect.!");
        alert.setHeaderText("Incorrect.");
        alert.setContentText("I'm sorry, but that was the wrong answer.");

        ButtonType buttonTypeNext = new ButtonType("Next Question");
        ButtonType buttonTypeBack = new ButtonType("Back to Main");

        alert.getButtonTypes().setAll(buttonTypeNext, buttonTypeBack);

        Optional<ButtonType> result = alert.showAndWait();
        ButtonType buttonTypeOne;
        if (result.get() == buttonTypeNext){
            // switch to the next question page
        } else {
            // switch to the main home page
        } 
    }
}