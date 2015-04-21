/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

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
    Alert alert = new Alert(AlertType.CONFIRMATION);
    alert.setTitle("How did you do?");
    alert.setHeaderText("Correct!");
    alert.setContentText("Good job! You should definitely continue.");
    ButtonType buttonTypeNext = new ButtonType("Next Question");
    ButtonType buttonTypeCancel = new ButtonType("Cancel", 
    ButtonData.CANCEL_CLOSE);
    alert.getButtonTypes().setAll(buttonTypeNext, buttonTypeCancel);
    
    
}
